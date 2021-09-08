package com.java.class08;

public class HomeWorkExample3 {
	public static void main(String[] args) {
		int physics = 90, maths = 90, chem = 90, bio = 89, computer = 96;

		int totalMarks = physics + maths + chem + bio + computer;

		int percentage = (int) (totalMarks / 500.0 * 100);

		if (percentage >= 90) {
			System.out.println("Grade A");
		} else if (percentage >= 80) {
			System.out.println("Grade B");
		} else if (percentage >= 70) {
			System.out.println("Grade C");
		} else if (percentage >= 60) {
			System.out.println("Grade D");
		} else if (percentage >= 40) {
			System.out.println("Grade E");
		} else {
			System.out.println("Grade F");
		}

	}
}
