package com.java.class13;

// Write a program to find reverse of given number

// input - 6587
// output - 7856

public class ReverseOfNumber {
	public static void main(String[] args) {
		int n = 6587;
		int rev = 0;

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}

		System.out.println(rev);

	}
}
