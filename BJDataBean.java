package com.goodee.basic;

public class BJDataBean {
	private int playerSum;
	private int comSum;
	public int getPlayerSum() {
		return playerSum;
	}
	public void setPlayerSum(int playerSum) {
		this.playerSum = playerSum;
	}
	public int getComSum() {
		return comSum;
	}
	public void setComSum(int comSum) {
		this.comSum = comSum;
	}
	
	//플레이어 숫자 더하기
	public void addPlayer(int num) {
		this.playerSum += num;
	}
	
	//컴퓨터 숫자 더하기
	public void addCom(int num) {
		this.comSum += num;
	}
	//플레이어 숫자 오버 여부
	public boolean isUserOver() {
		return playerSum > 21;
	}
	//플레이어 숫자가 21인지 확인 여부
	public boolean is21() {
		return playerSum == 21;
	}
	//컴퓨터 숫자 오버 여부
		public boolean isComOver() {
			return comSum > 21;
	}
	//컴퓨터가 유저 숫자를 앞지르는지 여부
		public boolean isComOverPlayer() {
			return comSum > playerSum;
		}
		
	
}
