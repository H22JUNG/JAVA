package com.goodee.basic;

import java.util.Random;
import java.util.Scanner;

public class BasicQuiz3 {
		static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Random ran = new Random();
		
		int com = ran.nextInt(100)+1;
		
		int count = 0;
		
		while(true) {
			System.out.println("1부터 99사이의 랜덤한 숫자를 입력해주세요");
			int val = scan.nextInt();
			if(val == com) {
				count++;
				System.out.println("["+count+"] 번째 시도만에 맞췄습니다.");
				break;
			}else if(val > com) {
				System.out.println("랜덤한 숫자는 현재 입력한 값보다 작습니다.");
				count++;
			}else {
				System.out.println("랜덤한 숫자는 현재 입력한 값보다 큽니다.");
				count++;
			}
		}
	
	}

}
