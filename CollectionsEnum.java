/* Write a program that defines an enum having months of the year and then prints the value of all the enum elements.
 * Java Enum is a special Java type used to define collections of constants*/


package com.sheetal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class CollectionsEnum {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		Enumeration<String> enumn=Collections.enumeration(list);
		while(enumn.hasMoreElements()){
			System.out.println(enumn.nextElement());
		}
		
		
		
}
}

