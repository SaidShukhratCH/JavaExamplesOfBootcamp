package com.java.class11;

public class ArrayExample {
	public static void main(String args[]) {

		// Declaration of single variable
		int num;

		// Declaration of array
		int data[];

		// initialize array
		data = new int[5];

		// Declaration & initialization in same line

		int listOfNum[] = new int[4];

		// Another way to declare & initialize array

		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		// Find length of an array
		System.out.println(numbers.length);

		// Print all numbers from array
		for (int i = 0; i <= 5; i++) {
			System.out.println(numbers[i]);
		}

	}
}
