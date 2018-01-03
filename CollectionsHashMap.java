/*Write a program having below methods.
  			--> To create a hashmap.(is used for storing Key & value pairs. it is unordered and allows null
  			--> To search for a key in the created map and then returns its value.*/
package com.sheetal;

import java.util.HashMap;

public class CollectionsHashMap {
	public static void main(String args[]) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Apple");
		hmap.put(6, "Banana");
		hmap.put(8, "Orange");
		hmap.put(65, "Pear");
		hmap.put(76, "Berry");

		String var = hmap.get(6);
		System.out.println("Value at index 6 is: " + var);

	}

}
