package com.shopping.demo.sec;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/auth")
//@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
	Logger log = LoggerFactory.getLogger(AuthController.class);
	@Autowired
	private TokenUtiles tokenUtils;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping(value = { "", "/login" })
		public JWTResponse singIn(@RequestParam String userName , @RequestParam String password) throws Exception {
		log.info("authentication >> ");
		Authentication authentication = null;
		try {
			authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(userName, password ));

		} catch (DisabledException dis) {
			return new JWTResponse(null, null, null, "USER_DISABLED");
		} catch (BadCredentialsException e) {
			return new JWTResponse(null, null, null, "INVALID_CREDENTIALS");
			}

		log.info("authentication >> " + authentication.isAuthenticated());
		if (authentication.isAuthenticated()) {
			log.info("authentication >> " + authentication.isAuthenticated());
			SecurityContextHolder.getContext().setAuthentication(authentication);

			UserDetails userDetails = userService.loadUserByUsername(userName);
			Optional<AppUser> user = userService.findByUserName(userName);

			String token = tokenUtils.generateToken(userDetails);

			return new JWTResponse(token, userName , user.get().getRoles(), "SUCCESS");
		}

	return new JWTResponse(null, null, null, "INVALID");
	}

	@GetMapping("/users")
	public List<AppUser> getAllUsers() {
		return userService.getAllUsers();
	}

}
