package com.java.class28;

public class CompileTimeException {
	public static void main(String[] args) throws ArithmeticException {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Enter j value more than zero");
		}
	}

	static void method2() {
		method3();
	}

	static void method3() throws ArithmeticException {
		int i = 5, j = 0;
		System.out.println(i / j);
	}
}
