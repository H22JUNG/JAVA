package com.goodee.basic;

import java.util.Random;
import java.util.Scanner;

public class BlackJackMain {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("블랙잭 게임 시작");
		Random ran = new Random();
		BJDataBean bean = new BJDataBean();
		String str = "졌습니다.";
		
		//유저 카드 뽑기
		while(true) {
			System.out.println("1. hit, 2. stand");
			int ch1 = scan.nextInt();
			if (ch1==1) {
				bean.addPlayer(ran.nextInt(1, 11));
				System.out.println("현재 당신의 합은 : " + bean.getPlayerSum());
				if(bean.isUserOver() == true) break;
			} else {
				break;
			}
		}
		//컴터
		while(bean.isUserOver() == false) {
			bean.addCom(ran.nextInt(1, 11));
			if(bean.isComOver()==true || bean.isComOverPlayer()==true) break;
	}
		if((bean.is21() == true || bean.isComOverPlayer() == false || bean.isComOver()==true)
				&& bean.getComSum() > 0) {
			str = "이겼습니다";
		}

		System.out.println(str + "      유저 : " + bean.getPlayerSum() + "      딜러 : " + bean.getComSum());
}
}
