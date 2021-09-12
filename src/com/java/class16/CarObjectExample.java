package com.java.class16;

import java.util.Scanner;

public class CarObjectExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaration of variable
		int i;

		// Declaration & initialization of object
		Car bmwX1 = new Car();
		Car audiA4 = new Car();

		System.out.println(bmwX1.color);
		System.out.println(audiA4.color);

		audiA4.color = "White";
		System.out.println(audiA4.color);
	}
}
