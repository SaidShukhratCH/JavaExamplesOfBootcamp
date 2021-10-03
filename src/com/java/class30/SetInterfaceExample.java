package com.java.class30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceExample {
	public static void main(String[] args) {

		List<String> data = new ArrayList<String>();

		Set<String> grocery = new HashSet<String>();

		data.add("banana");
		data.add("onion");
		data.add("tomato");
		data.add("apple");
		data.add("apple");

		System.out.println(grocery.add("banana"));
		System.out.println(grocery.add("onion"));
		System.out.println(grocery.add("tomato"));
		System.out.println(grocery.add("apple"));
		System.out.println(grocery.add("Apple"));

		System.out.println(data);
		System.out.println(grocery);

	}
}
