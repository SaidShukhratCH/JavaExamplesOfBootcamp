package com.java.class18;

public class ConstructorReview {
	public static void main(String[] args) {
		Car c1 = new Car("Black", "BMW X1", 6000);
		c1.showCarInfo();
	}
}

class Car {
	String color = "Black";
	String model = "Audi A4";
	int price  = 8000;

	Car(String colorFromUser, String modelFromUser, int priceFromUser) {
		System.out.println("From Constructor");
		
		color = colorFromUser;
		model = modelFromUser;
		price = priceFromUser;
	}

	void showCarInfo() {
		System.out.println(color);
		System.out.println(model);
		System.out.println(price);
	}
}