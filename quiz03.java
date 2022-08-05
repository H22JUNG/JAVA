package com.goodee.algorithm;

import java.util.Scanner;

public class quiz03 {
	Scanner scan = new Scanner(System.in);
	
	public quiz03() {
		String str = scan.nextLine();
		String answer="";
		
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		quiz03 quiz = new quiz03();

	}
}
