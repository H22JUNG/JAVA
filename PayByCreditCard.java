package com.goodee.Strategy;

import java.util.Scanner;

public class PayByCreditCard implements PayStrategy {

	private Scanner scan = new Scanner(System.in);
	private CreditCard card;

	//카드 정보 수집
	@Override
	public void collectPaymentDetails() {
		System.out.println("카드 번호를 입력해 주세요: ");
		String number = scan.nextLine();
		System.out.println("카드 만료 일자를 입력하세요 'mm/yy': ");
		String date = scan.nextLine();
		System.out.println("CVV 코드를 입력하세요: ");
		String cvv = scan.nextLine();

		card = new CreditCard(number, date, cvv);
	}
	@Override
	public boolean pay(int paymentAmount) {
		if (cardIsPresent()) {
			System.out.println(paymentAmount + "가 카드로 결제되셨습니다.");
			card.setAmount(card.getAmount()- paymentAmount);
			return true;
		} else {
			return false;
		}
	}
	private boolean cardIsPresent() {
		return card.getAmount()>0 ;
	}



}
