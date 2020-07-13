package com.raji;

public class Swaping {
public static void main(String[] args) {
	//using 3rd vendore variable
		/*
		 * int a=10; int b=20; int t=0; t=a; a=b; b=t; System.out.println(a);
		 * System.out.println(b);
		 */
int a=20,b=30;
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
}
}
