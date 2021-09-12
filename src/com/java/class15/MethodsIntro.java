package com.java.class15;

import java.util.Scanner;

public class MethodsIntro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		printLine('=', 200); // 200

		System.out.println("Welcome to Odd-Even Tool");
		printLine('=', 75); // 75

		System.out.println("Enter the number to check it's even or odd");

		printLine('-', 200); // 150
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is Even");
			printLine('#', 80); // 80
		} else {
			System.out.println(num + " is Odd");
			printLine('#', 80); // 80
		}
	}

	static void printLine(char c, int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

}
