package com.goodee.basic;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("블랙잭 게임 시작");
		Random ran = new Random();
		
		//플레이어 숫자 합
		int playerSum = 0;
		//컴퓨터 숫자 합
		int comSum = 0;
		//출력 문구
		String str = "졌습니다.";
		
		//유저 카드 뽑기
		while(true) {
			System.out.println("1. hit, 2. stand");
			int ch1 = scan.nextInt();
			
			if(ch1 == 1) {
				playerSum += ran.nextInt(1, 11);
				System.out.println("현재 당신의 합은 : " + playerSum);
				if (playerSum >= 21) break;
			} else {
				break;
			}
		}
		
		//컴퓨터 카드 뽑기
		while(playerSum < 21) {
			comSum += ran.nextInt(1, 11);
			if (comSum >= 21 || comSum >= playerSum) break;
		}
		//내가 이기는 조건
		if((playerSum == 21 || comSum <= playerSum || comSum > 21) && comSum > 0) {
			//딜러도 뽑아서 0보다 커졌을 때
			str = "이겼습니다";
		}
		
		System.out.println(str + "      유저 : " + playerSum + "      딜러 : " + comSum);
		

	}

}
