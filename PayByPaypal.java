package com.goodee.Strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayByPaypal implements PayStrategy {
	//고객정보 데이터 베이스
	private static final Map<String, String> DATA_BASE = new HashMap<>();
	private Scanner scan = new Scanner(System.in);
	
	//고객 정보 이메일
	private String email;
	//고객 정보 패스워드
	private String password;
	//인증 여부
	private boolean signedIn;

	//임시로 들어갈 데이터 <패스워드, 이메일>
	static {
		DATA_BASE.put("mike", "mike@naver.com");
		DATA_BASE.put("john", "john@daum.net");
	}
	
	//사용자 데이터 수집
	@Override
	public void collectPaymentDetails() {
		while(!signedIn) {
			System.out.print("이메일을 입력하세요: ");
			email = scan.nextLine();
			System.out.println("패스워드를 입력하세요: ");
			password = scan.nextLine();
			if(verify()) {
				System.out.println("데이터 확인에 성공하였습니다.");
			} else {
				System.out.println("잘못된 이메일 패스워드 형식입니다!");
			}
		}
		
	}
	//고객 정보 확인
	private boolean verify() {
		setSignedIn(DATA_BASE.get(password).equals(email) );
		return signedIn;
	}
	private void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}
	
	//향후 쇼핑 시도를 위해 고객 데이터를 저장한다.
	@Override
	public boolean pay(int paymentAmount) {
		if (signedIn) {
			System.out.println("페이팔로 " + paymentAmount + " 가 결제 되셨습니다.");
			return true;
		} else {
			return false;
		}
		
	}


}
