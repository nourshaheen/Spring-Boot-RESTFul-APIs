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

import com.shopping.demo.modal.Product;
import com.shopping.demo.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProduectController {
	
	@Autowired
	private ProductService productService ;
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> findAll() {
		
		return new ResponseEntity<List<Product>>(productService.findAll() , HttpStatus.OK )  ;
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> save (@RequestBody Product product){
		
		return new ResponseEntity<Product> (productService.save(product) , HttpStatus.OK);
	}
	

}
