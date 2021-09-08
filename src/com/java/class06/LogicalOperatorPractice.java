package com.java.class06;

public class LogicalOperatorPractice {
	public static void main(String[] args) {
		boolean b1 = true, b2 = false;

		int a = 10, b = 20, c = 15;

		System.out.println(b1 || b2 && b1);

		System.out.println(b2 || b2 && b1 || b2 && b1 && b2);

		System.out.println(a >= c && b >= c || a < b || a <= b && b < c);

	}
}
