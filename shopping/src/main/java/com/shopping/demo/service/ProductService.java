package com.shopping.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.demo.modal.Product;
import com.shopping.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository ;
	
	public List<Product> findAll () {
		return productRepository.findAll();
	}
	
	public Product save (Product product) {
		return productRepository.save(product);
	}

}
