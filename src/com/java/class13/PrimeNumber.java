package com.java.class13;

// Write a program to check given number is prime or not

// input - 13
// Number is prime

// Prime number can be divisible by only two numbers 
// 1 and it self

public class PrimeNumber {
	public static void main(String[] args) {

		int num = 59;
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
