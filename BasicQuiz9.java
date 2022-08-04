package com.goodee.book;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicQuiz9 {
	private static Scanner scan = new Scanner(System.in);
	
	private ArrayList<String> bookname = new ArrayList<String>();
	private ArrayList<String> publisher = new ArrayList<String>();
	private ArrayList<Boolean> rantal = new ArrayList<Boolean>();
	private ArrayList<Integer> days = new ArrayList<Integer>();
	
	public BasicQuiz9() {
		bookname.add("JAVA의 정석");
		publisher.add("도우 출판");
		rantal.add(true);
		days.add(0);
		
		bookname.add("이것이 자바다");
		publisher.add("한빛미디어");
		rantal.add(false);
		days.add(2);
		
		bookname.add("이펙티브 자바");
		publisher.add("인사이트");
		rantal.add(false);
		days.add(10);
		
		bookname.add("Head First 자바");
		publisher.add("한빛 미디어");
		rantal.add(false);
		days.add(13);
	}
	public static void main(String[] args) {
			BasicQuiz9 quiz = new BasicQuiz9();
			
			while(true) {
				System.out.println();
				System.out.println();
				System.out.println("--------------------------------대여 목록--------------------------------");
				System.out.println("   이름\t\t\t츌판사\t\t대여가능여부\t대여일");
				for(int i = 0; i <quiz.bookname.size(); i++) {
				System.out.print((i+1) +":" + quiz.bookname.get(i));
				System.out.print("\t\t" + quiz.publisher.get(i));
					if(quiz.rantal.get(i) == true) {
						System.out.print("\t\tO");
					} else {
						System.out.print("\t\tX");
					}
				System.out.println("\t\t" + quiz.days.get(i));
				}
				System.out.println("--------------------------------선택 메뉴--------------------------------");
				System.out.println("1. 대여하기");
				System.out.println("2. 반납하기");
				System.out.println("3. 책 추가하기");
				System.out.println("4. 책 제거하기");
				System.out.println("5. 종료하기");
				System.out.println();
				System.out.println("메뉴를 선택해주세요");
				int i = scan.nextInt();
				
				if(i==1) {
					System.out.println("몇번째 책을 대여하시겠습니까?");
					int num = scan.nextInt();
					if (quiz.rantal.get(num-1) == true) {
						quiz.rantal.set(num-1, false);
						quiz.days.set(num-1, +1);
						System.out.println(quiz.bookname.get(num-1)+"을 대여하셨습니다.");
					} else {
						System.out.println("해당 책은 대여하실 수 없습니다.");
					};
				}else if (i==2) {
					System.out.println("몇번째 책을 반납하시겠습니까?");
					int num = scan.nextInt();
					if (quiz.rantal.get(num-1) == false) {
						if(quiz.days.get(num-1) > 7) {
							System.out.println("책이 정상적으로 반납되셨습니다.");
							System.out.println("책의 기한이 [" + (quiz.days.get(num-1)-7) +"]일 연체되셨습니다.");
							System.out.println("수수료는 [" + (quiz.days.get(num-1)-7)*200 + "]원 입니다.");
							quiz.rantal.set(num-1, true);
							quiz.days.set(num-1, 0);
						} else {
							quiz.rantal.set(num-1, true);
							quiz.days.set(num-1, 0);
							System.out.println("책이 정상적으로 반납되셨습니다.");
						}
					} else {
						System.out.println("해당 책은 반납할 수 있는 책이 아닙니다.");
					};
				} else if(i==3) {
					scan.nextLine();
					System.out.println("책을 추가해주세요");
					System.out.println("책이름 : ");
					String bname = scan.nextLine();
					quiz.bookname.add(bname);
					
					System.out.println("출판사 : ");
					String bpub = scan.nextLine();
					quiz.publisher.add(bpub);
					quiz.rantal.add(true);
					quiz.days.add(0);
					System.out.println("책이 정상적으로 추가되었습니다 [" + bname+"] : [" + bpub + "]");

				} else if(i==4) {
					System.out.println("몇번째 책을 삭제하시겠습니까?");
					int num = scan.nextInt();
					quiz.bookname.remove(num-1);
					quiz.publisher.remove(num-1);
					quiz.rantal.remove(num-1);
					quiz.days.remove(num-1);
					System.out.println("책이 정상적으로 삭제되었습니다.");
				} else if(i==5) {
					System.out.println("시스템을 정상적으로 종료합니다");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
				}
			}
	}

	
	
}
