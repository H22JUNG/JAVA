package com.goodee.algorithm;

import java.util.Scanner;

public class quiz10 {
	Scanner scan = new Scanner(System.in);
	
	public quiz10() {
		String s = scan.next();
		char t = scan.next().charAt(0);
		int[] answer = new int[s.length()];
		//char t의 거리 관련 변수
		
		//왼쪽에서부터 t와의 거리
		int p = 1000;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		//오른쪽에서부터 t와의 거리
		p=1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==t) {
				p=0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
				//아까 넣었던거랑 지금 p랑 비교해서 최소값 넣기
			}
		}
		for(int x : answer) {
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {
		quiz10 quiz = new quiz10();
	}

}
