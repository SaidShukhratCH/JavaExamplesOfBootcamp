package com.java.class05;

// Take age & weight from user

// 1. age >= 18 and weight >= 50 --> You're eligible 
// 2. age >= 18 and weight < 50  --> You're under weight
// 3. age < 18 and weight >= 50  --> You're too young to donate blood
// 4. age < 18 and weight < 50  --> You're not eligible

public class BloodDonation {
	public static void main(String args[]) {
		int age = 19, weight = 46;

		if (age >= 18) {

			if (weight >= 50) {
				System.out.println("You're eligible");
			} else {
				System.out.println("You're under weight");
			}

		} else {

			if (weight >= 50) {
				System.out.println("You're too young to donate blood");
			} else {
				System.out.println("You're not eligible");
			}

		}

	}
}
