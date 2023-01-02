package com.Grocery.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Grocery.App.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
