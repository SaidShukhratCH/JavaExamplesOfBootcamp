package com.java.class14;

// Write a program to count number of vowels, digit, spaces from the string

public class StringMethodExample2 {
	public static void main(String[] args) {
		String str = "This is our 14th class and we will be completing String class today";

		int numberOfVowels = 0;
		int digit = 0;
		int spaces = 0;

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				numberOfVowels++;
				break;

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
				digit++;
				break;

			case ' ':
				spaces++;
				break;
			}
		}

		System.out.println("Num of vowels - " + numberOfVowels);
		System.out.println("Num of digit - " + digit);
		System.out.println("Num of spaces - " + spaces);

	}
}
