package com.java.class31;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>();

		marks.put("Chirag", 42);
		marks.put("Shyam", 47);
		marks.put("Umed", 55);
		marks.put("Madina", 39);

		System.out.println(marks.get("Madina"));
		
		

	}
}
