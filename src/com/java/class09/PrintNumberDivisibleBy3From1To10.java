package com.java.class09;

// Print numbers from 1 to 10 which are divisible by 3
// output - 3 6 9

public class PrintNumberDivisibleBy3From1To10 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}
}
