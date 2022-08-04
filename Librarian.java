package com.goodee.book;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
	private List<Book> books = new ArrayList<Book>();
	
	public Librarian() {
		books.add(new Book("JAVA의 정석", "도우 출판", true, 0));
		books.add(new Book("이것이 자바다", "한빛미디어", false, 2));
		books.add(new Book("이펙티브 자바", "인사이트", false, 10));
		books.add(new Book("Head First 자바", "한빛미디어", false, 13));
	}
	public void getBookList() {
		System.out.println();
		System.out.println();
		System.out.println("------------------------대여 목록------------------------");
		System.out.println("   이름\t\t출판사\t대여가능여부\t대여일");
		for(int i = 0; i <books.size(); i++) {
			System.out.println((i+1) +":" + books.get(i));
			}
	}
	public void getMenuList() {
		System.out.println("------------------------선택 메뉴------------------------");
		System.out.println("1. 대여하기");
		System.out.println("2. 반납하기");
		System.out.println("3. 책 추가하기");
		System.out.println("4. 책 제거하기");
		System.out.println("5. 종료하기");
		System.out.println();
		System.out.println("메뉴를 선택해주세요");
	}
	//책 대여/반납이 가능한지 불가능한지
	public boolean isRental (int num) {
		return books.get(num-1).isRantal();
	}
	//책 대여를 진행하는 로직
	public void setRental(int num) {
		if (books.get(num-1).isRantal() == true) {
			books.get(num-1).setRantal(false);
			books.get(num-1).setDays(1);
			System.out.println("["+books.get(num-1).getName() + "]을 대여하셨습니다.");
		} else {
			System.out.println("해당 책은 대여하실 수 없습니다.");
		};
	}
	//책 반납을 진행하는 로직 실행
	public void setReturn(int num) {
		if (books.get(num-1).isRantal() == false) {
			getFine(num);
			books.get(num-1).setRantal(true);
			books.get(num-1).setDays(0);
	}	else {
		System.out.println("해당 책은 반납할 수 있는 책이 아닙니다.");
	};
}
	public void getFine(int num) {
		if(books.get(num-1).getDays() > 7) {
			System.out.println("책이 정상적으로 반납되셨습니다.");
			System.out.println("책의 기한이 [" + (books.get(num-1).getDays()-7) +"]일 연체되셨습니다.");
			System.out.println("수수료는 [" + (books.get(num-1).getDays()-7)*200 + "]원 입니다.");
		} else {
			System.out.println("책이 정상적으로 반납되셨습니다.");
		}
	}
	
	//책 추가
	public void setBook(String name, String pub) {
		books.add(new Book(name, pub, true, 0));
	}
	//책 제거
	public void removeBook(int num) {
		books.remove(num-1);
	}
	
}
