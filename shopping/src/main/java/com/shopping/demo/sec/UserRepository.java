package com.shopping.demo.sec;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser,Long > {
	
	Optional<AppUser> findByUserName (String userName);

}
