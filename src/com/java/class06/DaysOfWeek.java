package com.java.class06;

// Take day number from user and print day name
// input - 0, 1....6
// Output - Sunday, Monday....Saturday

public class DaysOfWeek {
	public static void main(String[] args) {
		int day = 3;

		switch (day) {
		case 0:
			System.out.println("Sun");
			break;
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		default:
			System.out.println("Enter number from 0 to 6 only");

		}

	}
}
