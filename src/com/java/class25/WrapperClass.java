package com.java.class25;

import com.java.class16.Car;

public class WrapperClass {
	public static void main(String[] args) {
		int i = 10; // primitive data type

		Integer num = i; // Converting primitive data type to object

		Car c = new Car();
		System.out.println(c.year);

	}
}
