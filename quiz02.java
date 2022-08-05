package com.goodee.algorithm;

import java.util.Scanner;

public class quiz02 {
	Scanner scan = new Scanner(System.in);

	public quiz02() {
	String answer ="";
	String str = scan.next();
	
	for(char x : str.toCharArray()) {
		if(Character.isLowerCase(x) == false)
			answer+=Character.toLowerCase(x);
		else
			answer+=Character.toUpperCase(x);
	}
	System.out.println(answer);
}
	public static void main(String[] args) {
		quiz02 quiz = new quiz02();
	}
}
