package com.goodee.basic;

public class AnalysisGame {
	RandomThreeNumbers rtn;
	int ball = 0;
	int strike = 0;
	int out = 0;
	
	public AnalysisGame() {
		rtn = new RandomThreeNumbers();
		
		for(int i =0; i<rtn.getLength(); i++) {
			System.out.print(rtn.getAnswerSingle(i));
		}
	}
	public void analysis(int[] inp) {
		this.ball = 0;
		this.strike = 0;
		this.out = 0;
		
		for(int i=0; i<inp.length; i++) {
			if(inp[i] == rtn.answer2[i]) {
				strike++;
			} else if((inp[0] == rtn.answer2[1] || inp[0] == rtn.answer2[2])
					|| (inp[1] == rtn.answer2[2] || inp[1] == rtn.answer2[0])
					|| (inp[2] == rtn.answer2[0] || inp[2] == rtn.answer2[1])) {
				ball++;
			} else {
				out++;
			}
		}
	}
	
	public String getResult() {
		return "볼: " + ball +"  스트라이크 : " + strike + "  아웃 : " + out;
	}
	public boolean isThreeStrike() {
		return (strike == 3 ) ? true : false;
	}
}
