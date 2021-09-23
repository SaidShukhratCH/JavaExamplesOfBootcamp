package com.java.class23;

class Bank {
	private int balance;

	Bank() {
		balance = 1000;
	}

	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}



	void withdraw(int amount) {
		balance = balance - amount;
	}

}

public class EncapsulationBrainStomring {
	public static void main(String[] args) {
		Bank acc1 = new Bank();
		acc1.setBalance(5000);
		System.out.println(acc1.getBalance());
	}
}
