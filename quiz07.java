package com.goodee.algorithm;

import java.util.Scanner;

public class quiz07 {
	Scanner scan = new Scanner(System.in);
	//회문 문자열
	public quiz07() {
		String str= scan.next();
		String answer="YES";
		str = str.toLowerCase();
		
		int len = str.length();
		for(int i =0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) {
				answer = "NO";
			}
		}
		
		System.out.println(answer);
	}
	public static void main(String[] args) {
		quiz07 quiz = new quiz07();
	}
}
