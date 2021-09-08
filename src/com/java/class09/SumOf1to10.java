package com.java.class09;

// 1 + 2 + 3 + ...+ 10

public class SumOf1to10 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10; i <= 20; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}
}
