package com.shopping.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.demo.modal.Order;
import com.shopping.demo.service.OrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	@Autowired
	private OrderService orderService ;
	
	@GetMapping("/order")
	public ResponseEntity<List<Order>> findAll() {
		
		return new ResponseEntity<List<Order>>(orderService.findAll() , HttpStatus.OK )  ;
	}
	
	@PostMapping("/order")
	public ResponseEntity<Order> save (@RequestBody Order order){
		
		return new ResponseEntity<Order> (orderService.save(order) , HttpStatus.OK);
	}
	

}
