// Write a program to find duplicates in an array using set.
package com.sheetal;

public class CollectionsDuplicates {
	public static void main(String[] args) {
		String[] strArr = { "Apple", "Mango", "Pineapple", "Orange", "Apple" };

		for (int i = 0; i < strArr.length - 1; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if ((strArr[i].equals(strArr[j])) && (i != j)) {
					System.out.println("Duplicate Element is : " + strArr[j]);
				}
			}
		}
	}
}
