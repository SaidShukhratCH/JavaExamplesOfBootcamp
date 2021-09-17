package com.java.class19;

class Phone {
	String color;

	Phone(Phone p) {
		System.out.println("From Constructor");
		p.showInfo();
	}

	Phone() {

	}

	void showInfo() {
		System.out.println(color);
	}
}

public class TrickestQuestion {
	public static void main(String args[]) {
		Phone p = new Phone(new Phone());
	}
}