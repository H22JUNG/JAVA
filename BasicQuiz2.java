package com.goodee.basic;

import java.util.Scanner;

public class BasicQuiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력해 주세요");
		int a = Integer.parseInt(scan.nextLine());
		
		System.out.println("두번째 수를 입력해 주세요");
		int b = Integer.parseInt(scan.nextLine());
		
		System.out.println("어떤 연산을 할 것인지 선택해주세요(1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈)");
		int x = Integer.parseInt(scan.nextLine());
		
		int result = 0;
		switch(x) {
		case 1 : 
			result = a + b;
			break;
		case 2 : 
			result = a - b;
			break;
		case 3 : 
			result = a * b;
			break;
		case 4 : 
			result = a / b;
			break;
		}
		
		System.out.println("연산 결과는 [" + result + "] 입니다.");

	}

}
