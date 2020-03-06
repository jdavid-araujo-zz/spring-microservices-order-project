package com.david.appstore.payment.service;

import com.david.appstore.payment.domain.Payment;

public interface PaymentService extends BaseService<Payment, Long> {

	Payment findByOrderId(Long orderId);
}
