package com.java.class17;

public class NoArgumentConstroctor {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.drive();
	}
}

class Car {

	String color;
	int numOfGears;
	
	Car() {
		color = "Black";
		numOfGears = 5;
	}

	void drive() {
		System.out.println("Driving " + color + " car");
	}

}
