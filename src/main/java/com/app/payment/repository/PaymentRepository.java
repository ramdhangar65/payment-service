package com.app.payment.repository;

import com.app.payment.collection.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment,Integer> {
    Payment findByOrderId(Integer orderId);
}
