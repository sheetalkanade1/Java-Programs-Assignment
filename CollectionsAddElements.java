//To create an arraylist and add elements to it.
package com.sheetal;

import java.util.ArrayList;

public class CollectionsAddElements {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Apple");
		al.add("Mango");
		al.add("Pineapple");
		al.add("Orange");

		System.out.println("Added elements are: " + al);
		
	}
}