package com.java.class15;

public class StringReview {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "		Hello world		";

		System.out.println(str1.equals(str2));
		System.out.println(str1.trim().equalsIgnoreCase(str2.trim()));

		System.out.println(str2.trim());

		System.out.println(str2.contains(str1));

		System.out.println(str1.length());

		System.out.println(str1.indexOf('e'));

		System.out.println(str1.charAt(0));

		System.out.println(str1.toUpperCase());

		System.out.println(str1.toLowerCase());

		System.out.println(str2.substring(2, 6));

		String str3 = "This will cost USD 25 and discount will be USD 2";

		System.out.println(str3.replace("USD", "INR"));

		System.out.println(str3.replaceAll("(USD)", "INR"));

		String parts[] = str3.split("USD");

		System.out.println(parts.length);

		String str4 = "Good morning! %s";

		System.out.println(String.format(str4, "Sumeyra"));

	}
}
