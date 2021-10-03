package com.java.class29;

public class GenericExample {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		Box<String> b2 = new Box<String>();

		b1.setValue(10);
		b2.setValue("Chirag");
		System.out.println(b1.getValue());
		System.out.println(b2.getValue());
	}
}