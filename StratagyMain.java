package com.goodee.Strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StratagyMain {
	//상품과 가격 정보
	private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
	private Scanner scan = new Scanner(System.in);
	
	//주문
	private static Order order = new Order();
	//PayStratagy 객체를 담을 전략 객체
	private static PayStrategy strategy;
	
	//상품 내용
	static {
		priceOnProducts.put(1, 2200);
		priceOnProducts.put(2, 1850);
		priceOnProducts.put(3, 1100);
		priceOnProducts.put(4, 890);
	}
	
	public StratagyMain() {
		while(!order.isClosed()) {
			int cost;
			
			String continueChoice;
			do {
				System.out.println("상품을 선택해주세요: ");
				System.out.println("1 - Mother board");
				System.out.println("2 - CPU");
				System.out.println("3 - HDD");
				System.out.println("4 - Memory");
				
				int choice = scan.nextInt();
				cost = priceOnProducts.get(choice);
				
				System.out.print("갯수: ");
				int count = scan.nextInt();
				
				//총 가격
				order.setTotalCost(cost * count);
				System.out.print("상품을 더 구매하시겠습니까? Y/N: ");
				scan.nextLine();
				continueChoice = scan.next();
				
			} while(continueChoice.equalsIgnoreCase("Y"));
			if (strategy == null) {
				System.out.println("결제 방식을 선택해주세요:");
				System.out.println("1 - PayPal");
				System.out.println("2 - Credit Card");
				int paymentMethod = scan.nextInt();
				
				//클라이언트의 선택에 따라 다른 결제 전략을 도입한다.
				if(paymentMethod == 1) {
					PayByPaypal paypal = new PayByPaypal();
				} else if(paymentMethod == 2) {
					PayByCreditCard creditcard = new PayByCreditCard();
				} else {
					System.out.println("잘못된 숫자를 입력하셨습니다.");
				}
				
			}
			//order.processOrder();
			
			scan.nextLine();
			System.out.print(order.getTotalCost() + " 지불됩니다. 계속하시겠습니까? P/C: ");
			String proceed = scan.nextLine();
			if(proceed.equalsIgnoreCase("P")) {
				if(strategy.pay(order.getTotalCost())) {
					System.out.println("결제가 성공적으로 진행되었습니다.");
				} else {
					System.out.println("결제가 실패하였습니다.");
				}
				order.setClosed();
			}
		}
	}
	public static void main(String[] args) {
		StratagyMain sm = new StratagyMain();
	}
}
