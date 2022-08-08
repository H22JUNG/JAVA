package com.goodee.coffee;

public class Stocks {
	private String source;
	private int amount;
	
	public Stocks(String source, int amount) {
		this.source = source;
		this.amount = amount;
	}

	public String getSource() {
		return source;
	}

	public void plusAmount(int amount) {
		this.amount += amount;
	}
	public void minusAmount(int amount) {
		this.amount -= amount;
	}

	@Override
	public String toString() {
		return "[재료명=" + source + ", 양=" + amount + "]";
	}

	
	
	
}
