package com.shopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.demo.modal.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
