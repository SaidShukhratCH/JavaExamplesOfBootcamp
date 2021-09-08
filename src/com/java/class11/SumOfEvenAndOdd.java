package com.java.class11;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		int sumEvn = 0;
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				sumEvn = sumEvn + numbers[i];
			} else {
				sumOdd = sumOdd + numbers[i];
			}

		}

		System.out.println(sumOdd);
		System.out.println(sumEvn);
	}
}
