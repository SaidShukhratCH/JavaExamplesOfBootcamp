package com.java.class30;

import java.util.ArrayList;
import java.util.List;

public class ListReview {
	public static void main(String[] args) {

		List<String> data = new ArrayList<String>();

		data.add("banana");
		data.add("onion");
		data.add("tomato");
		data.add("apple");

		data.remove(2);
		data.remove("onion");

		for (String element : data) {
			System.out.println(element);
		}

	}
}
