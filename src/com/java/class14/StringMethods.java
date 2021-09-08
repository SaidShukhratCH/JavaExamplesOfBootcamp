package com.java.class14;

public class StringMethods {
	public static void main(String[] args) {
		// 1. Checking the equality of String

		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("1. " + s1.equals(s2));

		// 2. Checking the equality of String
		String s3 = "hello";
		System.out.println("2. " + s1.equalsIgnoreCase(s3));

		// 3. Changing the case of String
		System.out.println("3. Upper Case - " + s1.toUpperCase());
		System.out.println("3. Lower Case - " + s1.toLowerCase());

		// 4. Changing the case of String
		String s4 = "Hello Chirag, How are you?";
		String s4Upper = s4.toUpperCase();
		String s3Upper = s3.toUpperCase();
		System.out.println("4. Contains - " + s4Upper.contains(s3Upper));

		// 5. Index of character
		System.out.println("5. Index of - " + s4.indexOf(','));
		System.out.println("5. Index of - " + s4.indexOf("Chirag"));
		System.out.println("5. Last Index of - " + s4.lastIndexOf(' '));

		// 6. Character at particular index
		System.out.println("6. Character at index - " + s4.charAt(6));

		// 7. Length of String
		System.out.println("7. Length of String - " + s4.length());

		// 8. SubString
		System.out.println("8. Sub String - " + s4.substring(5));
		System.out.println("8. Sub String - " + s4.substring(5, 12));

		// 9. Empty
		String s5 = "				";
		System.out.println("9. Empty - " + s5.isEmpty());
		System.out.println("9. Blank - " + s5.isBlank());

		// 10. Replace
		String s6 = "Welcome ####";
		String username = "Mayram";
		String price = "USD 15";
		System.out.println("10. Replace - " + s6.replace("##", username));
		// Replace based on regular expression
		System.out.println("10. ReplaceAll - " + price.replaceAll("[0-9]", ""));

		// 11. Format
		String s7 = "Welcome %s %s";
		System.out.println("11. Format - " + String.format(s7, username, "Chirag"));

		// 12. Split
		String s8 = "My name is - Chirag - SprintQA - Instructor";
		String parts[] = s6.split("-");
		System.out.println(parts.length);

	}
}
