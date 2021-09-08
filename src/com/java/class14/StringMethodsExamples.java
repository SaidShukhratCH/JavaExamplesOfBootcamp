package com.java.class14;

// Write a program to count number of word in String

public class StringMethodsExamples {
	public static void main(String[] args) {
		String str = "The Times of India is an Indian English language daily newspaper and digital news media owned and managed by The Times Group. It is the third largest newspaper in India by circulation and largest selling";

		String parts[] = str.split(" ");

		System.out.println(parts.length);
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
