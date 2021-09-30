package com.java.class28;

public class FinallyKeyword {
	public static void main(String[] args) {
		System.out.println("Program start");
		int i = 1, j = 0;

		try {
			System.out.println("Opening DB connection"); // 1
			System.out.println("Executing query"); // 2
			System.out.println(i / j); // 3

		} finally {
			System.out.println("Closing db connection"); // 4
		}
	}
}
