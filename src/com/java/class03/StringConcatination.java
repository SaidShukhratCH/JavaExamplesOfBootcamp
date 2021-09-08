package com.java.class03;

public class StringConcatination {
	public static void main(String args[]) {
		String str1 = "Hello";
		String str2 = "Welcome";
		String space = " ";

		int a = 10;
		int b = 20;

		System.out.println(str1 + space + str2);

		System.out.println(str1 + a);

		System.out.println(str1 + a + b);

		System.out.println(a + b + str1);
		
		System.out.println(str1 + (a + b));

		System.out.println(str1 + a * b);
		
		System.out.println(str1 + (a - b));                      
	}
}
