package com.java.class29;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// Declaration of list object

		int array[] = new int[10];

		List<Integer> data = new ArrayList<Integer>();

		data.add(10);
		data.add(40);
		data.add(39);
		data.add(77);

		array[0] = 10;
		array[1] = 40;
		array[2] = 39;
		array[3] = 77;

		System.out.println(array.length);
		System.out.println(data.size());

		System.out.println(array[0]);
		System.out.println(data.get(0));

		System.out.println(data.contains(40));

		System.out.println(data.isEmpty());

		System.out.println(data.indexOf(40));

	}
}
