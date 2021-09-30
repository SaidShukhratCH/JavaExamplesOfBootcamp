package com.java.class28;

public class ThrowKeyword {
	public static void main(String[] args) throws Exception {
		int day = 13;

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
			throw new Exception("Enter number from 0 to 6 only");
		}

	}
}
