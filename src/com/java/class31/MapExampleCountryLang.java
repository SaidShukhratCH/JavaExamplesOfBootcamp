package com.java.class31;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExampleCountryLang {
	public static void main(String[] args) {

		Map<String, String> countryLang = new HashMap<String, String>();

		countryLang.put("USA", "English");
		countryLang.put("UK", "English");
		countryLang.put("India", "Hindi");
		countryLang.put("Turkiye", "Turkish");

		// Retrieve collections of keys
		System.out.println("======Retrieve collections of keys=======");
		Set<String> keys = countryLang.keySet();

		for (String key : keys) {
			System.out.println(key + "	=	" + countryLang.get(key));
		}

		// Retrieve collections of pairs
		System.out.println("======Retrieve collections of pairs=======");
		Set<Entry<String, String>> pairs = countryLang.entrySet();

		for (Entry<String, String> entry : pairs) {
			System.out.println(entry.getKey() + "	=	" + entry.getValue());
		}

	}
}
