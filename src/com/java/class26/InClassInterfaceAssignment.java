package com.java.class26;

interface Vehicle {

	void drive();

	void pressBreak();
}

interface Car {

	void playMusic();

	void navigate();
}

class BMW implements Vehicle, Car {

	@Override
	public void playMusic() {
		System.out.println("Playing BMW music");
	}

	@Override
	public void navigate() {
		System.out.println("I can navigate to BMW showroom");
	}

	@Override
	public void drive() {
		System.out.println("Let's drive BMW");
	}

	@Override
	public void pressBreak() {
		System.out.println("pressing breakkkkkkk...");
	}

}

class Tesla implements Car, Vehicle {

	@Override
	public void drive() {
		System.out.println("Let's drive Tesla");
	}

	@Override
	public void pressBreak() {
		System.out.println("pressing breakkkkkkk...");
	}

	@Override
	public void playMusic() {
		System.out.println("Playing Tesla music");
	}

	@Override
	public void navigate() {
		System.out.println("I can navigate to Tesla showroom");
	}

}

public class InClassInterfaceAssignment {
	public static void main(String[] args) {
		String car = "Tesla";
		Car c = null;

		if (car.equals("BMW")) {
			c = new BMW();
		} else if (car.equals("Tesla")) {
			c = new Tesla();
		} else {
			System.out.println("We don't serve your car");
		}

		c.navigate();
		c.playMusic();

	}
}
