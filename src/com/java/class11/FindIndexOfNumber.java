package com.java.class11;

public class FindIndexOfNumber {
	public static void main(String[] args) {
		int numbers[] = { 43, 46, 47, 40, 12, 35, 47 };

		int targetNumber = 47;

		for (int i = 0; i < numbers.length; i++) {
			if (targetNumber == numbers[i]) {
				System.out.println(i);
			}
		}
	}
}
