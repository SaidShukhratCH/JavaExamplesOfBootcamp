package com.java.class30;

import java.util.HashSet;
import java.util.Set;

// Print duplicate character from the String
// i, s, o, r, ,a
public class FindDuplicatesCharacter {
	public static void main(String[] args) {
		String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa";

		Set<Character> setOfChar = new HashSet<Character>();
		Set<Character> duplicateChar = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (setOfChar.add(str.charAt(i)) == false) {
				duplicateChar.add(str.charAt(i));
			}
		}

		System.out.println(duplicateChar);
	}
}
