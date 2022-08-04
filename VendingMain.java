package com.goodee.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMain {
	private Scanner scan = new Scanner(System.in);
	
	private ArrayList<Menus> menus = new ArrayList<Menus>();
	public VendingMain() {
		menus.add(new Menus("레쓰비", 1000));
		menus.add(new Menus("비타500", 1500));
		menus.add(new Menus("레드불", 2000));
		menus.add(new Menus(scan.nextLine(), scan.nextInt()));
		
		System.out.println("----자판기 메뉴----");
		for(int i=0; i < menus.size(); i++) {
			System.out.println((i+1) + "."+ menus.get(i) + "원");
			}
		System.out.println("-------------------");
		
		System.out.println("메뉴를 골라주세요");
		int num = scan.nextInt();
		
		int price = 0;
		String menu = "";
		
		if (num<=4) {
			price += menus.get(num-1).getPrice();
			menu = menus.get(num-1).getMenu();
		} else {
			System.out.println("잘못된 메뉴를 선택하셨습니다.");
		}
		
		if(price != 0) {
			System.out.println("음료가 나왔습니다> " + menu +":"+price);
		}
	}
	
	public static void main(String[] args) {
		VendingMain vend = new VendingMain();
	}
}
