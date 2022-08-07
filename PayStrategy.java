package com.goodee.Strategy;

public interface PayStrategy {
	boolean pay(int paymentAmount);
	void collectPaymentDetails();
}
