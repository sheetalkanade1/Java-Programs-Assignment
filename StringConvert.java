 //Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3 "
package com.sheetal;

public class StringConvert {
	
	public static void main(String[] args) {
	      String str = "This is nice";
	      String strReplace = str.replace("This", "This1").replace("is", "is2").replace("nice", "nice3");
	      System.out.println( strReplace );
	     
	      
	   }
	}

