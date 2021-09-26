package com.java.class25;

abstract class Bank {
	int balance;

	abstract void displayInterestRate();

	void withdraw(int amount) {
		balance = balance - amount;
	}
}

class HSBCBank extends Bank {
	void displayInterestRate() {

	}
}

class BankOfAmerica extends Bank {
	void displayInterestRate() {
		System.out.println("3%");
	}
}

public class AbstractionExample {
	public static void main(String[] args) {

	}
}