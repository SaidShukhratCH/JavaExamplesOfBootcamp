package com.java.class21;

class Bank1 {
	int balance;

	Bank1() {
		balance = 1000;
	}

	void displayBalance() {
		System.out.println(balance);
	}
}

class HSBCBank1 extends Bank1 {
	void openFixedDeposit() {
		if (balance > 500) {
			System.out.println("FD open successfully");
		} else {
			System.out.println("You're not eligible");
		}
	}
}
