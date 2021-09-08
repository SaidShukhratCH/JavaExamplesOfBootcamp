package com.java.class11;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		int sum = 0;

		// Print all numbers from array
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		System.out.println(sum);

	}
}
