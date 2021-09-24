package com.java.class15;

public class PrintPrimeFrom2to50 {

	public static void main(String[] args) {
		for (int i = 2; i <= 999; i++) {
			if (isPalindrom(i) == true) {
				System.out.println(i);
			}
		}
	}

	 static boolean isPalindrom(int num) {
		int rev = 0;
		int backup = num;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (rev == backup) {
			return true;
		} else {
			return false;
		}

	}

	static boolean isPrime(int num) {
		int divisor = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				divisor++;
			}
		}

		if (divisor == 0) {
			return true;
		} else {
			return false;
		}
	}
}
