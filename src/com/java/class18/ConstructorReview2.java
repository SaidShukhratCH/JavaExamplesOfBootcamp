package com.java.class18;

public class ConstructorReview2 {
	public static void main(String[] args) {
		Car1 c1 = new Car1("White", "Audi", 6000);
		Car1 c2 = new Car1();
		c2.showCarInfo();
	}
}

class Car1 {

	String color;
	String model;
	int price;

	Car1(String colorFromUser, String modelFromUser, int priceFromUser) {
		color = colorFromUser;
		model = modelFromUser;
		price = priceFromUser;
	}
	
	Car1(){
		System.out.println("From Constructor");
	}

	void showCarInfo() {
		System.out.println(color);
		System.out.println(model);
		System.out.println(price);
	}
}