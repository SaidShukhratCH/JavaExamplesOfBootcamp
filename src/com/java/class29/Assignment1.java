package com.java.class29;

import java.util.LinkedList;
import java.util.List;

public class Assignment1 {
	public static void main(String[] args) {
		List<String> groceryItems = new LinkedList<String>();

		groceryItems.add("potato");
		groceryItems.add("lemon");
		groceryItems.add("orange");
		groceryItems.add("banana");
		groceryItems.add("onion");

		System.out.println(groceryItems.contains("banana"));

		System.out.println(groceryItems.size());

		System.out.println(groceryItems.get(4));

	}
}
