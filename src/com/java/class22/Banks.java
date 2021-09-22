package com.java.class22;

class Bank {

	int balance=100;

	void displayBalance() {
		System.out.println(balance);
	}
}

class HSBCBank extends Bank {
	void displayBalance() {
		System.out.println("HSBC: "+balance);
	}
}

class BankOfAmerica extends Bank {
	void displayBalance() {
		System.out.println("BOA: "+balance);
	}
}

class CitiBank extends Bank {
	void displayBalance() {
		System.out.println("CITI: "+balance);
	}
}
