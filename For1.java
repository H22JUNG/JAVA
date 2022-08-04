package com.goodee.basic1;

import java.util.Random;

public class For1 {

	public static void main(String[] args) {
		System.out.println("--------------------1번--------------------");
		for (int i=0; i<3; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------2번--------------------");
		for (int i=0; i<6; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------3번--------------------");
		for (int i=1; i<4; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------4번--------------------");
		for (int i=5; i<8; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------5번--------------------");
		for (int i=3; i>0; i--) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------6번--------------------");
		for (int i=1; i<6; i+=2) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------7번--------------------");
		for (int i=1; i<9; i*=2) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------8번--------------------");
		for (int i=1; i<10; i*=-2) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------9번--------------------");
		for (int i=1, j=1; i < 6; i++, j++) {
			System.out.print(i);
			System.out.print(j);
		}
		System.out.println();
		System.out.println("--------------------10번--------------------");
		Random ran = new Random();
		for (int i = 5; i!=1; i=(ran.nextInt(5))+1) {
			System.out.print(i);
		}
	
	}

}
