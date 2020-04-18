package com.shopping.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.demo.modal.Order;
import com.shopping.demo.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository ;
	
	public List<Order> findAll () {
		return orderRepository.findAll();
	}
	
	public Order save (Order Order) {
		return orderRepository.save(Order);
	}

}
