package com.david.appstore.payment.resource;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.david.appstore.payment.domain.Payment;
import com.david.appstore.payment.service.PaymentService;

@RestController
@RequestMapping(name = "/payments")
public class PaymentResource implements Serializable {

	private static final long serialVersionUID = -8462910963784348320L;

	private PaymentService paymentService;
	
	@Autowired
	public PaymentResource(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "{id}")
	public Payment findById(@PathVariable(value = "id") Long id) {
		return this.paymentService.findById(id);
	}
	@ResponseStatus(value = HttpStatus.CREATED)
	@GetMapping()
	public void pay(@RequestBody Payment entity) {
		this.paymentService.save(entity);
	}
	
}
