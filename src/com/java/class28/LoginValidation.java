package com.java.class28;

public class LoginValidation {
	public static void main(String[] args) throws Exception {

		String username = "sprintqa", password = "admin12";

		if (username.equals("sprintqa")) {

			if (password.equals("admin123")) {
				System.out.println("Login success");
			} else {
				throw new Exception("Invalid password");
			}

		} else {
			throw new Exception("Invalid username");
		}

	}
}
