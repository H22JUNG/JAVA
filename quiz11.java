package com.goodee.algorithm;

import java.util.Scanner;

public class quiz11 {
	Scanner scan = new Scanner(System.in);
	public quiz11() {
		String s = scan.next();
		String answer = "";
		s = s + " ";
		int cnt = 1;
		for(int i=0; i<s.toCharArray().length-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) { // 앞뒤 알파벳이 같으면
				cnt++; // cnt 늘어남
				
			} else { // 알파벳이 같지 않을 때 == 연속되는 알파벳이 끝나면
				if(cnt == 1) { // 겹치는 알파벳 없이 하나만 있을 때에는
					answer += s.charAt(i); // 그냥 알파벳 하나만 출력하기(숫자 안넣기)
					cnt = 1; // cnt 초기화
				} else {
					answer += s.charAt(i) + Integer.toString(cnt); //겹치는 알파벳의 수만큼 숫자 쓰기
					cnt = 1; //초기화
				}
			}
		}
			
		System.out.println(answer);
	}
	
	
	public static void main(String[] args) {
		quiz11 quiz = new quiz11();

	}

}
