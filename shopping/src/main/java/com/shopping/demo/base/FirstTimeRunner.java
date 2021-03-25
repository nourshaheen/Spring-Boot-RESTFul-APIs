package com.shopping.demo.base;

import java.util.Date;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shopping.demo.modal.Order;
import com.shopping.demo.modal.Product;
import com.shopping.demo.sec.AppUser;
import com.shopping.demo.sec.UserService;
import com.shopping.demo.service.OrderService;
import com.shopping.demo.service.ProductService;

@Component
public class FirstTimeRunner implements CommandLineRunner {

	private final Log log = LogFactory.getLog(FirstTimeRunner.class);

	
	@Autowired
	private ProductService productService ;
	
	@Autowired
	private OrderService orderService ;
	
	@Autowired
	private UserService userService ;
	
	@Override
	public void run(String... args) throws Exception {

		log.info("when project run");
		
		productService.save(new Product(1L, "product 1", 1200.1));
		productService.save(new Product(2L, "product 2", 2200.2));
		log.info("Product saved successfully");
		
//		orderService.save(new Order(1L, "Order 1" , new Date(), 10L));
//		orderService.save(new Order(2L, "Order 2" , new Date(), 20L));
		log.info("Order saved successfully");
		
		
		userService.addUser(new AppUser("admin" , "admin" , true , "ADMIN_ROLE,USER_ROLE"));
		userService.addUser(new AppUser("user" , "user" , true , "USER_ROLE"));


	}

}
