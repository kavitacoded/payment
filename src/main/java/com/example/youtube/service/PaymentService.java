package com.example.youtube.service;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.youtube.entity.Payment;
import com.example.youtube.repository.PaymentRepository;

@Service
public class PaymentService {

		@Autowired
	private PaymentRepository repository;
	
		
		public Payment dopayment(Payment payment) {
			
//			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			payment.setTransactionID(UUID.randomUUID().toString());
			
			return repository.save(payment);
		}


		
}
