package com.app.payment.controller;

import com.app.payment.collection.Payment;
import com.app.payment.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/payments")
@RestController
public class PaymentController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PaymentService paymentService;

    @GetMapping("/welcome-msg")
    public String paymentMessage() {
        logger.debug("Welcome Message from Payment Service...");
        return "Welcome Message for  Payment Service...";
    }
    @GetMapping("/doPayment/{orderId}")
    public Payment findPaymentDetailsByOrderId(@PathVariable Integer orderId) {
        logger.debug("Inside Payment Controller findPaymentDetailsByOrderId");
        return paymentService.findPaymentDetailsByOrderId(orderId);
    }
    @GetMapping("/paymentDetails")
    public List<Payment> getAllPaymentDetails() {
        logger.debug("Inside Payment Controller getAllPaymentDetails");
        return paymentService.getAllPaymentDetails();
    }

}
