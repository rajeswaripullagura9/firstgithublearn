package com.raji;

public class RevreseString {
	public static void reverseString(String name) {
		char[] cs = name.toCharArray();
		int length = name.length();
		for (int i = length-1; i >=0 ; i--) {
			System.out.print(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		reverseString("rajeswari");
	}
}
