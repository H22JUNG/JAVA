package com.goodee.coffee;

import java.util.ArrayList;

public class Orders {
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Integer> counts = new ArrayList<Integer>();
	
	
	public void setMenu(Menu menu) {
		this.menus.add(menu);
	}
	public void setCount(Integer count) {
		this.counts.add(count);
	}
	
	//총 금액을 구하는 로직
	public int getTotalPrice() {
		int total = 0;
		for(int i =0; i < menus.size(); i++) {
			total += menus.get(i).getPrice() * counts.get(i);
		}
		return total;
	}
	
	
}
