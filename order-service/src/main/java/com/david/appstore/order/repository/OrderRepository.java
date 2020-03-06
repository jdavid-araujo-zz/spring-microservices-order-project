package com.david.appstore.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.appstore.order.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
