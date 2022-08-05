package com.goodee.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz12 {
	Scanner scan = new Scanner(System.in);
	
	public quiz12() {
		int n = scan.nextInt(); //자연수 N
		int[] arr = new int[n]; // N개의 정수만큼 배열에 숫자 넣을거임
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt(); // N개의 정수 입력
		}
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		for(int i=2; i<n; i++) {
			if(arr[i] > arr[i-1]) { //배열 안에서 비교했을 때 자기 바로 앞에보다 값이 크면
				answer.add(arr[i]); // answer에 넣기
			}
		}
		for(int x : answer) {
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {
		quiz12 quiz = new quiz12();
	}
}
