package com.java.class27;

public class ExceptionHandling {
	public static void main(String[] args) {
		int i = 15, j = 3;
		int a[] = new int[5];

		try {
			System.out.println(i / j); // 2
			System.out.println(a[6]); // 3
		} catch (Exception ae) {
			System.out.println("We're having technical difficulties"); // 6
		}

	}
}
