package com.goodee.coffee;

public class Resource {
	//재료명
	private String name;
	//소모되는 양
	private int consumeAmount;
	
	public Resource(String name, int consumeAmount) {
		this.name = name;
		this.consumeAmount = consumeAmount;
	}
	public String getName() {
		return name;
	}
	
	public int getConsumeAmount() {
		return consumeAmount;
	}
}
