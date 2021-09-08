package com.java.class04;

// Write a program to print number of days in a given month 

// 1 - 31 days
// 2 - 28/29 days
// 3 - 31 days
// 4 - 30 days
//..12 - 31 days

public class NumberOfDaysInMonth {
	public static void main(String args[]) {
		int month = 11;

		if (month == 1) {
			System.out.println("31 days");
		} else if (month == 2) {
			System.out.println("28/29 days");
		} else if (month == 3) {
			System.out.println("31 days");
		} else if (month == 4) {
			System.out.println("30 days");
		} else if (month == 5) {
			System.out.println("31 days");
		} else if (month == 6) {
			System.out.println("30 days");
		} else if (month == 7) {
			System.out.println("31 days");
		} else if (month == 8) {
			System.out.println("31 days");
		} else if (month == 9) {
			System.out.println("30 days");
		} else if (month == 10) {
			System.out.println("31 days");
		} else if (month == 11) {
			System.out.println("30 days");
		} else if (month == 12) {
			System.out.println("31 days");
		}else {
			System.out.println("Please enter number from 1 to 12 only");
		}

	}
}
