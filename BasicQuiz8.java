package com.goodee.basic;

import java.util.Scanner;

public class BasicQuiz8 {
	private Scanner scan = new Scanner(System.in);
	
	public BasicQuiz8() {
		System.out.println("----자판기 메뉴----");
		System.out.println("1. 레쓰비 : 1000원");
		System.out.println("2. 비타500 : 1500원");
		System.out.println("3. 레드불 : 2000원");
		System.out.println("-------------------");
		
		//자판기 버튼 누르기
		System.out.println("메뉴를 골라주세요");
		int num = scan.nextInt();
		
		//자판기 돈 계산
		int price = 0;
		String menu = "";
		
		switch(num) {
		case 1 :
			price += 1000;
			menu = "1. 레쓰비";
			break;
		case 2 :
			price += 1500;
			menu = "2. 비타500";
			break;
		case 3 :
			price += 2000;
			menu = "3. 레드불";
			break;
		default : 
			System.out.println("잘못된 메뉴를 선택하셨습니다.");
		}
		if(price != 0) {
			System.out.println("음료가 나왔습니다> "+menu +":"+price);
		}
	}
	public static void main(String[] args) {
		BasicQuiz8 quiz = new BasicQuiz8();
	}

}
