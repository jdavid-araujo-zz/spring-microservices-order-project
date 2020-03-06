package com.david.appstore.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.appstore.order.domain.Order;
import com.david.appstore.order.repository.OrderRepository;
import com.david.appstore.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private OrderRepository orderRepository;
	
	@Autowired	
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
