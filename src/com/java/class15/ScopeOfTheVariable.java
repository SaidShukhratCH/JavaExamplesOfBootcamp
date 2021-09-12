package com.java.class15;

public class ScopeOfTheVariable {
	public static void main(String[] args) {
		int i = 1;
		
		
		if (i <= 10) {

			i++;
			int count = 0;
		}

		System.out.println(i);
		System.out.println(count);
	}
}
