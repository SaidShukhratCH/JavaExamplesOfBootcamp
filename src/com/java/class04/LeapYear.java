package com.java.class04;

// Write a program to check given year is a leap year or not

public class LeapYear {
	public static void main(String[] args) {
		int year = 2017;

		if (year % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("not leap year");
		}
	}
}
