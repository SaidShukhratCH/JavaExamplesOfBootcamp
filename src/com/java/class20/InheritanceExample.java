package com.java.class20;

class Bank {
	int balance;
	String accountName;
	String accountNumbers;

	void deposit(int amount) {
		balance = balance + amount;
	}

	void withdraw(int amount) {
		balance = balance - amount;
	}

	void printBalance() {
		System.out.println(balance);
	}
}

class HSBCBank extends Bank {
		static void displayInterestRate() {
			System.out.println("6%");
		}
}

public class InheritanceExample {
	public static void main(String[] args) {
		HSBCBank acc1 = new HSBCBank();
		HSBCBank acc2 = new HSBCBank();
		acc1.balance = 1000;
		acc1.withdraw(400);
		acc2.deposit(3000);
		acc2.printBalance();
		HSBCBank.displayInterestRate();
	}
}
