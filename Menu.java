package com.goodee.coffee;

import java.util.ArrayList;

public class Menu {
	private String name;
	private int price;
	private ArrayList<Resource> consumeList;
	
	public Menu(String name, int price, ArrayList<Resource> consumeList) {
		this.name = name;
		this.price = price;
		this.consumeList = consumeList;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public ArrayList<Resource> getConsumeList() {
		return consumeList;
	}
	
	public String toString() {
		return "[이름=" + name + ", 가격=" + price + "]";
	}
}
