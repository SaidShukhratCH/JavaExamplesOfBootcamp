package com.java.class12;

public class SumOfEachRow {
	public static void main(String[] args) {
		int numbers[][] = { { 4, 5, 9, 4 }, { 1, 2, 6, 4 }, { 1, 4, 9, 4 } };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = 0;

			for (int j = 0; j < numbers[i].length; j++) {
				sum = sum + numbers[i][j];
			}

			System.out.println(sum);
		}

	}
}
