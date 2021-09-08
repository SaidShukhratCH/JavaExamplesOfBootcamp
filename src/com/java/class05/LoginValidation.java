package com.java.class05;

// Take user name & password from user

// DB user name & password is 1234 & 1111

// if user name is wrong but password is correct ---->   Your user name is wrong
// if user name is wrong but password is incorrect ----> You've entered invalid cred
// if user name is correct but password is correct ----> Login successful
// if user name is correct but password is incorrect ----> Your password is wrong
public class LoginValidation {
	public static void main(String args[]) {
		int username = 3523, password = 53532;
		int dbUsername = 1234, dbPassword = 2222;

		if (username == dbUsername) {
			if (password == dbPassword) {
				System.out.println("Login successful");
			} else {
				System.out.println("Your password is wrong");
			}
		} else {
			if (password == dbPassword) {
				System.out.println("Your user name is wrong");
			} else {
				System.out.println("You've entered invalid cred");
			}
		}

	}
}
