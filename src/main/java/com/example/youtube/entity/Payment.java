package com.example.youtube.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name="Payment_Tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

	@Id
	@GeneratedValue
	private int paymentid;
	private String paymentstatus;
	private String transactionId;
	
	public void setTransactionID(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
