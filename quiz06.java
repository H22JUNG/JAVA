package com.goodee.algorithm;

import java.util.Scanner;

public class quiz06 {
	Scanner scan = new Scanner(System.in);

public quiz06() {
	String str= scan.next();
	String answer="";
	for(int i =0; i<str.length(); i++) {
		if(str.indexOf(str.charAt(i)) == i) {
			answer += str.charAt(i);
			//String.indexOf(x) : 문자열 안에서 특정 문자 x의 인덱스 위치를 알아낸다
			//String.charAt(i) : i번째의 글자 한개를 char 형태로 받음
			// ex) 'hello'에서 4번째 l을 찾아도 3번째 l로 검색이 됨 -> 중복 문자열 제거 원리
		}
	}
	System.out.println(answer);
}
	public static void main(String[] args) {
		quiz06 quiz = new quiz06();

	}

}

