package com.java.class15;

public class ArrayRevision {
	public static void main(String[] args) {
		int data[] = { 3, 6, 9, 2, 4 };
		int min = data[0];

		for (int i = 0; i < data.length; i++) {
			if (min > data[0]) {
				min = data[0];
			}
		}

		System.out.println(min);
	}
}
