package com.shopping.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.demo.modal.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
