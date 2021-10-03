package com.java.class30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDuplicateValuesFromList {
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();

		Set<Integer> setOfData = new HashSet<Integer>();

		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(10);
		data.add(30);

		for (Integer ele : data) {
			if (setOfData.add(ele) == false) {
				System.out.println(ele);
			}
		}

	}
}
