package com.java.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingElementsOfList {
	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		int num[] = new int[5];
		data.add("banana");
		data.add("onion");
		data.add("tomato");
		data.add("apple");
		data.add("mango");

		// Traversing list using index based for loop
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + "    " + data.get(i));
		}

		// Traversing list using for each loop
		for (String s : data) {
			System.out.println(s);
		}

		// Traversing list using Iterator
		Iterator<String> itr = data.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
