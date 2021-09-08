package com.java.class06;

// Take digit(0-9) from the user and print value in word
// Example 
// Input - 9
// Output - nine

public class SwitchStatementExample {
	public static void main(String[] args) {
		int num = 18;

		switch (num) {
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 0:
			System.out.println("Zero");
			break;
		default:
			System.out.println("Please enter the digit from 0 to 9 only");
		}

	}
}
