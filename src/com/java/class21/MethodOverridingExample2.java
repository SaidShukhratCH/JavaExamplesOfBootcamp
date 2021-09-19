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
		Circle c = new Circle();
		c.draw();
	}
}
