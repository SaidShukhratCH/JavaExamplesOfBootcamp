package com.java.class28;

class Car {
	void drive() throws Exception {
		System.out.println("Driving");
	}
}

public class ExceptionReview {
	public static void main(String[] args) throws Exception {
		Car c = new Car();
		c.drive();
	}
}
