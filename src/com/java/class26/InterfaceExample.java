package com.java.class26;

interface Bank {

	int i = 12;

	public abstract void displayBalance();

	public abstract void deposit(int amount);

	public abstract void withdraw(int amount);
}

interface PrivateSectorBank extends Bank {
	void displayNPA();
}

class HSBCBank implements PrivateSectorBank {

	@Override
	public void deposit(int amount) {

	}

	@Override
	public void withdraw(int amount) {

	}

	@Override
	public void displayNPA() {

	}

	@Override
	public void displayBalance() {

	}

}

public class InterfaceExample {
	public static void main(String[] args) {

	}
}
