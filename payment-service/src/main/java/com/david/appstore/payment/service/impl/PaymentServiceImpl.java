package com.david.appstore.payment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.david.appstore.payment.domain.Payment;
import com.david.appstore.payment.repository.PaymentRepository;
import com.david.appstore.payment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	private PaymentRepository paymentRepository;
	
	@Autowired
	public PaymentServiceImpl(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}
	
	@Override
	public Payment findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Payment entity) {
		this.paymentRepository.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment findByOrderId(Long orderId) {
		
		Optional<Payment> payment = this.paymentRepository.findByOrderId(orderId);
		
		return payment.orElseThrow(() -> new EmptyResultDataAccessException(1));
	}

}
