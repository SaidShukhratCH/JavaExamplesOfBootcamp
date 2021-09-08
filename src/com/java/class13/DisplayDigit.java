package com.java.class13;

// Write a program to seperate each digit from the number
// Input - 5782
// Output
// 2
// 8
// 7
// 2

public class DisplayDigit {
	public static void main(String[] args) {
		int n = 564;

		while (n != 0) {
			System.out.println(n % 10);
			n = n / 10;
		}
	}
}
