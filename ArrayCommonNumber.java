//Write a program to find the common number in any given two arrays.
//we iterate both the given arrays and compare each element of one array with elements of other array. If the elements are found to be equal print it
package com.sheetal;

public class ArrayCommonNumber {

	public static void main(String args[]) {
		int a[] = {22,4,55,67,78,99};
		int b[] = {44,56,77,99,45,32};
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length ; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
