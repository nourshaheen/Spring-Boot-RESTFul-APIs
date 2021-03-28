package com.shopping.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopping.demo.modal.Order;
import com.shopping.demo.repository.OrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
	
	
	private final OrderRepository orderRepository ;
	
	
	public Order findById (Long id) {
		return orderRepository.findById(id).orElse(null);
	}
	
	public List<Order> findAll () {
		return orderRepository.findAll();
	}
	
	public Order save (Order Order) {
		log.info("order is is " + Order.getId());
		return orderRepository.save(Order);
	}

}
