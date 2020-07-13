package com.raji;

public class Test1 {
	public static void main(String[] args) {
		for (int i = 10, j = 1; i > j; --i, ++j) {
			System.out.println(j % i);
		}
	}
}
