package com.java.gitpractice;

public class LoginPage {
	public static void main(String[] args) {

		int num = 39;
		int divisor = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				divisor++;
				System.out.println(i);
			}
		}

		if (divisor == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
