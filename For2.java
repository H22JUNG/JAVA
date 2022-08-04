package com.goodee.basic1;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("--------------------1번--------------------");
		for (int i=1; i < 6; i++) {
			System.out.print(i+") ");
		}
		System.out.println();
		System.out.println("--------------------2번--------------------");
		for (int i=1; i < 6; i++) {
			System.out.print(i+", ");
		}
		System.out.println();
		System.out.println("--------------------3번--------------------");
		for (int i=1; i < 6; i++) {
			System.out.print("(" + i +") ");
		}
		System.out.println();
		System.out.println("--------------------4번--------------------");
		for (int i=1; i < 5; i++) {
			System.out.print(i+", ");
			if(i==4)
				System.out.println(i+1);
		}
		System.out.println();
		System.out.println("--------------------5번--------------------");
		for (int i=1; i < 5; i++) {
			System.out.print(i+"|");
			if(i==4)
				System.out.println(i+1);
		}
		System.out.println();
		System.out.println("--------------------6번--------------------");
		for (int i=2; i <= 10; i+=2) {
			System.out.print("(" + i + ")");
		}
		System.out.println();
		System.out.println("--------------------7번--------------------");
		for (int i=1; i <= 10; i++) {
			if(i%2 != 0) {
			System.out.print("("+i);
			}else {
			System.out.print(i +")");
			}
		}
		System.out.println();
		System.out.println("--------------------8번--------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수");
		int a = scan.nextInt();
		System.out.println("두번째 수");
		int b = scan.nextInt();
		
		System.out.println("두 수의 사이수는");
		for(int i =(a+1); i<b; i++) {
			if(i+1==b) System.out.print(i);
			else System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("--------------------9번--------------------");
		System.out.println("첫번째 수");
		int x = scan.nextInt();
		System.out.println(x+"의 약수");
		for(int i=1; i<=x; i++) {
			if(x%i == 0)
			System.out.print(" (" + i + ") ");
		}
		System.out.println();
		System.out.println("--------------------10번--------------------");
		System.out.println("첫번째 수");
		int q = scan.nextInt();
		System.out.println("두번째 수");
		int w = scan.nextInt();
		
		System.out.println("구구단"+q+"단");
		for(int i=q; i<=q; i++) {
			for(int j=1; j<=w; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
			
		}

	}

}
