package com.raji;

public class RemoveDuplicatesInArray {
public static void main(String[] args) {
	int[] a= {1,1,2,2,3,3,4,4};
	int tem[]=new int[a.length];
	int j=0;
	for (int i = 0; i < tem.length-1; i++) {
		if(a[i]!=a[i+1]) {
			tem[j]=a[i];
			j++;
		}
	}
	tem[j]=a[a.length-1];
	for (int i=0;i<a.length;i++) {
		System.out.println(tem[i]);
	}
}
}
