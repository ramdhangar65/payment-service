package com.app.payment.service;

import com.app.payment.collection.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getAllPaymentDetails();
    Payment findPaymentDetailsByOrderId(Integer orderId);

}
