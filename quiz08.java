package com.goodee.algorithm;

import java.util.Scanner;

public class quiz08 {
	Scanner scan = new Scanner(System.in);

	public quiz08() {
		String str = scan.nextLine();
		String answer = "NO";
		
		str = str.toUpperCase() //모두 대문자로 변형
				.replaceAll("[^A-Z]", ""); //대문자 제외한 모든 특수문자 삭제
		
		String tmp = new StringBuilder(str).reverse().toString();
		//new StringBuilder(string) : String의 완전 객체 형태, String처럼 쓸 수 없지만 String을 인자로 받아 사용이 가능하다.
		//StringBuilder.reverse() : 문자열을 뒤집는다.
		//StringBuilder.toString() : StringBuilder 객체를 문자열로 반환한다
		
		if(tmp.equals(str)) {
			answer = "YES";
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		quiz08 quiz = new quiz08();
	}

}
