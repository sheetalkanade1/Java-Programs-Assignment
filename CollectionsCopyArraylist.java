/*Write a program to copy arraylist to an array.
 * this can be done by calling toArray() method. it returns an array containing all of the elements in this list in proper sequence*/
package com.sheetal;

import java.util.ArrayList;
import java.util.List;

public class CollectionsCopyArraylist {
	public static void main(String a[]) {
		List<String>  arr = new ArrayList<String>();
		arr.add("Apple");
		arr.add("Banana");
		arr.add("Orange");
		arr.add("pear");
		
		String[] strArr = new String[arr.size()];
		arr.toArray(strArr);
		
		System.out.println("Copied Array:");
		for (String str : strArr) {
			System.out.println(str);
		}
	}
}
