package com.goodee.coffee;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {

	Scanner scan = new Scanner(System.in);
	ArrayList<Menu> menus = new ArrayList<Menu>();
	ArrayList<Stocks> stocks = new ArrayList<Stocks>();
	private int totalEarn = 0;
	private int orderCount = 0;
	
	public CoffeeShop() {
		
		//메뉴
		ArrayList<Resource> menu1Resource = new ArrayList<Resource>();
		menu1Resource.add(new Resource("커피콩", 2));
		menus.add(new Menu("아메리카노", 2000, menu1Resource));
		
		ArrayList<Resource> menu2Resource = new ArrayList<Resource>();
		menu2Resource.add(new Resource("커피콩", 2));
		menu2Resource.add(new Resource("우유", 2));
		menus.add(new Menu("카페라떼", 2500, menu2Resource));
		
		ArrayList<Resource> menu3Resource = new ArrayList<Resource>();
		menu3Resource.add(new Resource("커피콩", 2));
		menu3Resource.add(new Resource("시럽", 1));
		menus.add(new Menu("카푸치노", 3000, menu3Resource));
		
		//재고
		stocks.add(new Stocks("커피콩", 50));
		stocks.add(new Stocks("시럽", 80));
		stocks.add(new Stocks("우유", 60));
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("어서오세요! 구디 커피숍에 오신 것을 환영합니다.");
			System.out.println("어떤 메뉴를 사용하시겠습니까? (1. 주문 2. 재고 3. 출력 4.종료)");
			int a = scan.nextInt();
			System.out.println(a);

			switch(a) {
			case 1 : 
				System.out.println("주문 메뉴를 선택하셨습니다.");
				System.out.println("------------주문------------");
				setOrder();
				break;
			case 2 :
				System.out.println("재고 관리 메뉴를 선택하셨습니다.");
				System.out.println("------------재고 관리------------");
				getStocks();
				break;
			case 3 :
				System.out.println("출력 메뉴를 선택하셨습니다.");
				System.out.println("------------출력------------");
				gettotal();
				break;
			case 4 :
				System.out.println("시스템을 종료합니다.");
				break;
			}

		}
	}


	public void setOrder() {
		Orders orders = new Orders();
		while(true) {
			for(int i = 0; i < menus.size(); i++) {
				System.out.println(i + " : " + menus.get(i));
			}
			System.out.println("몇번 메뉴를 주문하시겠습니까?");
			int menuNum = scan.nextInt();
			System.out.println("수량은 얼마나 주문하시겠습니까?");
			int count =  scan.nextInt();

			orders.setMenu(menus.get(menuNum));
			orders.setCount(count);
			
			//소모 로직
			for(Resource consume : menus.get(menuNum).getConsumeList()) {
				for(Stocks stock : stocks) {
					if(consume.getName().equals(stock.getSource())) {
						stock.minusAmount(consume.getConsumeAmount()*count);
					}
				}
			}
			System.out.println("종료하시겠습니까? (1.yes, 2.no)");
			int choose = scan.nextInt();
			if(choose == 1 ) {
				break;
			}
		}
		System.out.println("총 금액은 " + orders.getTotalPrice() + " 입니다.");
		this.totalEarn += orders.getTotalPrice();
		this.orderCount++;
	}
	
	public void getStocks() {
		while(true) {
		for(int i =0; i < stocks.size(); i++) {
			System.out.println(i + " : " + stocks.get(i));
		}
		System.out.println("재고를 채우시겠습니까?(1.yes 2.no)");
		int cho1 = scan.nextInt();
		if(cho1 == 2) break;
		System.out.println("몇번째 재고를 채우시겠습니까?");
		int cho2 = scan.nextInt();
		System.out.println("얼마만큼 재고를 채우시겠습니까?");
		int cho3 = scan.nextInt();
		
		stocks.get(cho2).plusAmount(cho3);
		}
	}
	
	public void gettotal() {
		System.out.println("총 수입 : " + totalEarn);
		System.out.println("총 주문량 : " + orderCount);
	}


}
