package com.app.payment.service;

import com.app.payment.collection.Payment;
import com.app.payment.repository.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPaymentDetails() {
        logger.debug("Inside Payment Controller getAllPaymentDetails");
        return paymentRepository.findAll();
    }

    @Override
    public Payment findPaymentDetailsByOrderId(Integer orderId) {
        logger.debug("Inside Payment Controller findPaymentDetailsByOrderId");
        Payment payment = paymentRepository.findByOrderId(orderId);
        if (payment != null)
            return payment;
        return Payment.builder()
                .message("Record Not Found")
                .status("Fail")
                .build();
    }
}
