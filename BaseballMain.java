package com.goodee.basic;

import java.util.Scanner;

public class BaseballMain {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		AnalysisGame ag = new AnalysisGame();

		int count = 1;
		boolean isWin = false;

		while(count<=9) {
			System.out.println(count + "회차");
			int[] inp = new int[3];
			System.out.println("숫자 3개를 입력 받으세요");
			System.out.println("첫번째 숫자");
			inp[0] = scan.nextInt();
			System.out.println("두번째 숫자");
			inp[1] = scan.nextInt();
			System.out.println("세번째 숫자");
			inp[2] = scan.nextInt();

			ag.analysis(inp);
			count++;
			System.out.println(ag.getResult());

			if(ag.isThreeStrike() == true) {
				isWin = true;
				System.out.println("이겼습니다!");
				break;
			}
		}
		if(isWin == false) {
			System.out.println("졌습니다.");
		}
	}
}
