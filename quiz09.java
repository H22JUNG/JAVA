package com.goodee.algorithm;

import java.util.Scanner;

public class quiz09 {
	Scanner scan = new Scanner(System.in);
	
	public quiz09() {
		String str = scan.next();
		String answer ="";
		int a = 0;
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x) == true) {
				answer += Character.getNumericValue(x);
			}
		}
		System.out.println(Integer.parseInt(answer));
	}

	public static void main(String[] args) {
		quiz09 quiz = new quiz09();

	}

}
