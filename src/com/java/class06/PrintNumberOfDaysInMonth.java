package com.java.class06;

public class PrintNumberOfDaysInMonth {
	public static void main(String[] args) {
		String month = "Nov";

		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "July":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("31");
			break;

		case "Feb":
			System.out.println("28/29");
			break;

		case "April":
		case "June":
		case "Sept":
		case "Nov":
			System.out.println("30");
			break;

		default:
			System.out.println("Please enter valid month");

		}

	}
}
