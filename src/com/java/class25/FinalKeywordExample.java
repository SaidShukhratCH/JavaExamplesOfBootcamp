package com.java.class25;

final class Parent {
	void eat() {
		System.out.println("Parent eating");
	}
}

class Child extends Parent {
	void eat() {
		System.out.println("Child eating");
	}
}

public class FinalKeywordExample {
	public static void main(String[] args) {
		final double PI = 3.14;

	}
}
