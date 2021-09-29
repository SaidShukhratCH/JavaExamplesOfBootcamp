package com.java.class27;

abstract class Vehicle {

	String color;
	int numOfGear;

	Vehicle() {
		System.out.println("1. From Abstract class");
	}

	private void drive() {
		System.out.println("Driving from vehicle");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Driving from Car");
	}
}

public class StaticOverridingExample {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.drive();
	}
}
