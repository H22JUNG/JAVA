package com.goodee.algorithm;

import java.util.Scanner;

public class quiz01 {
	Scanner scan = new Scanner(System.in);

	public quiz01() {
		String str = scan.next();
		
		char t = scan.next().charAt(0);
		
		int answer = 0;
	
		str = str.toUpperCase();
		t=Character.toUpperCase(t);
		
		char[] strarr = str.toCharArray();
		for(int i=0; i<strarr.length-1; i++) {
			if(strarr[i] == t) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	public static void main(String[] args) {
		quiz01 quiz01 = new quiz01();
	}

}
