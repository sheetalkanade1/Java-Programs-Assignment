//Write a program to check for a palindrome string.
package com.sheetal;

import java.util.Scanner;


public class StringPalindrome {
	@SuppressWarnings("resource")
	public static void main(String args[])
	   {
	      String str, reverse = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	    	  reverse = reverse + str.charAt(i);
	 
	      if (str.equals(reverse))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
	}