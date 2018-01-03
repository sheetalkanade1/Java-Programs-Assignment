/*To search for an element in the list.
to search an element of java using ArrayList object using contains, indexOf and lastIndexOf methods.*/
package com.sheetal;

import java.util.ArrayList;

public class CollectionsSearchElements {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Apple");
		al.add("Mango");
		al.add("Pineapple");
		al.add("Orange");

		if (al.contains("Apple")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("Element not found");
		    }
	}

}
