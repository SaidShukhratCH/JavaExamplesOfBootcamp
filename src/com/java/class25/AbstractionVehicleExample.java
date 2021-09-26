package com.java.class25;

class Vehicle {
	void drive() {
		
	}
}

class Car extends Vehicle {

}

class Scooter extends Vehicle {

}

public class AbstractionVehicleExample {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.drive();
	}
}
