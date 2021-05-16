package com.example.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.youtube.entity.Payment;
import com.example.youtube.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	
	@Autowired
	 private PaymentService service;
	
	@PostMapping("/dopayment")
	public Payment dopayment(@RequestBody Payment payment) {
		return service.dopayment(payment);
	}
	
}
