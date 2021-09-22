package com.java.class22;

public class BankPaypalTesting {
	public static void main(String[] args) {
		// Create bank account
		HSBCBank user1Acc = new HSBCBank();
		BankOfAmerica user1AccBOA = new BankOfAmerica();
		CitiBank user1Citi = new CitiBank();
		
		// Create paypal object
		Paypal user1Paypal = new Paypal();
		user1Paypal.checkBalance(user1Acc);
		user1Paypal.checkBalance(user1AccBOA);
		user1Paypal.checkBalance(user1Citi);
	
	}
}
