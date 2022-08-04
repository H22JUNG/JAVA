package com.goodee.book;

public class Book {
	private String name;
	private String pub;
	private boolean rantal;
	private int days;
	
	public Book(String name, String pub, boolean rantal, int days) {
		super();
		this.name = name;
		this.pub = pub;
		this.rantal = rantal;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public boolean isRantal() {
		return rantal;
	}

	public void setRantal(boolean rantal) {
		this.rantal = rantal;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return name + "\t" + pub + "\t" + (rantal?"O":"X") + "\t" + days;
	}
	
	
	
	
}
