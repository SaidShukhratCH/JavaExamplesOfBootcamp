package com.java.class21;

class Bank {
	int balance;

	void displayInterestRate() {
		System.out.println("6.5%");
	}

	void deposit(int amount) {
		balance = balance + amount;
	}

}

class HSBCBank extends Bank {
	void displayInterestRate() {
		System.out.println("5%");
	}
}

class BankOfAmerica extends Bank {
	void displayInterestRate() {
		System.out.println("4%");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		BankOfAmerica boa = new BankOfAmerica();
		HSBCBank acc1 = new HSBCBank();
		acc1.displayInterestRate();
		boa.displayInterestRate();
	}
}
