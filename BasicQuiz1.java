package com.goodee.basic;

import java.util.Scanner;

public class BasicQuiz1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신이 입력할 값을 넣어주세요");
		String str = scan.nextLine();
		System.out.println("당신이 입력한 값은 [" + str + "] 입니다.");

	}

}
