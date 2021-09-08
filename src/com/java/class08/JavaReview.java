package com.java.class08;

public class JavaReview {
	public static void main(String[] args) {
		String country = "India";

		switch (country) {
		default:
			System.out.println("Please enter valid country");
			break;
		case "india":
			System.out.println("Delhi");
		case "USA":
			System.out.println("Washington");
		case "Turkey":
			System.out.println("Ankara");

		}
	}
}
