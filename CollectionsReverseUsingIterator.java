//To print the elements in the reverse order using ListIterator.
package com.sheetal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsReverseUsingIterator {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Apple");
		al.add("Mango");
		al.add("Pineapple");
		al.add("Orange");

		// System.out.print("Original contents of al: ");
		ListIterator iter = al.listIterator(al.size());

		while (iter.hasPrevious()) {
			System.out.println(iter.previous());
		}

	}
}