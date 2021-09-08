package com.java.class10;

// 1*2 + 2*3 + 3*4 + 4*5 +.....+10*11

public class FindResultOfSeries {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i * (i + 1);
		}

		System.out.println(sum);
	}
}
