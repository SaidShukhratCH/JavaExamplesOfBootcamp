package com.java.class25;

abstract class Shape {

	abstract void printNameOfShape();

	void erase() {
		System.out.println("erasing shape");
	}
}

class Circle extends Shape {

	void printNameOfShape() {
		System.out.println("Circle");
	}

}

public class AbstractClassExample2 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.printNameOfShape();
		c.erase();
	}
}
