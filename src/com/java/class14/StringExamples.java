package com.java.class14;

public class StringExamples {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 10;

		System.out.println(a == b);
		System.out.println(a == c);

		// Creating variable / object S1 and directly assigning value "Hello"
		String s1 = "Hello";
		String s2 = "Hello";
		// Creating object of S3 with value "Hello"
		String s3 = new String("Hello");

		// Compare memory address of s1 & s2
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);

		System.out.println(s2);
		System.out.println(s3);

		// Compare content of s2 & s3 using method
		System.out.println(s2.equals(s3));
	}
}
