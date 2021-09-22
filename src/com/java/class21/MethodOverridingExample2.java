package com.java.class21;

class Shape {
	void draw() {
		System.out.println("Drawing shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing circle");
	}
}

public class MethodOverridingExample2 {
	public static void main(String[] args) {
		System.out.println("a1.2.3".replaceAll("[^0-9\\.]", ""));
	}
}
