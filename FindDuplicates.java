package com.raji;

import java.util.HashMap;

public class FindDuplicates {
	public static void duplicate(String name) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char[] cs = name.toCharArray();
		for (char c : cs) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1 );
			}
		}
		System.out.println("name---->"+hashMap);
		
	}

	public static void main(String[] args) {

		duplicate("rajeswari");
	}
}
