package com.goodee.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz04 {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> answer = new ArrayList<String>();
	
	public quiz04() {
		//숫자 받아서 그 수만큼 단어 입력
		int n = scan.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = scan.next();
		}
		
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt=0, rt=x.length()-1;
			 while (lt < rt) {
	              char tmp = s[lt];
	              s[lt] = s[rt];
	              s[rt] = tmp;
	              lt++;
	              rt--;
	          }
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		for(String x : answer) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		 quiz04 quiz = new quiz04();

	}

}
