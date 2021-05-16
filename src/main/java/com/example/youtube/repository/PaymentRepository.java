package com.example.youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.youtube.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {

	
}
