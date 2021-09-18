package com.java.class20;

class BasicCalculator {

	void sum(int a, int b) {
		System.out.println((a + b));
	}

	void sub(int a, int b) {
		System.out.println((a - b));
	}
}

class AdvanceCalculator extends BasicCalculator {

	void mul(int a, int b) {
		System.out.println(a * b);
	}

	void div(int a, int b) {
		System.out.println(a / b);
	}
}

public class InheritanceFirstExample {
	public static void main(String[] args) {
		BasicCalculator basicCal = new BasicCalculator();
		AdvanceCalculator ac = new AdvanceCalculator();
		ac.sum(10, 20);
	}
}
