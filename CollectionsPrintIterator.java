//To print the elements of the list using iterator
//Iterator enables you to cycle through a collection, obtaining or removing elements. 
package com.sheetal;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsPrintIterator {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Apple");
		al.add("Mango");
		al.add("Pineapple");
		al.add("Orange");

		System.out.print("Original contents of al: ");
	      Iterator<String> itr = al.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
		
	}

}
