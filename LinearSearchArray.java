/*Write a program to perform a linear search on any given array.Linear search is the basic search where you look for the element to be searched in a sequential way.
Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, print the message.*/
package com.sheetal;

import java.util.Scanner;

public class LinearSearchArray {
	public static void main(String args[])
		   {
		      int c, num, item, arr[];
		      
		      @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		      System.out.println("Enter number of elements:");
		      num = input.nextInt(); 
		      
		      arr = new int[num]; 
		      System.out.println("Enter " + num + " integers");
		      
		      for (c = 0; c < num; c++)
		        arr[c] = input.nextInt();

		      System.out.println("Enter the search value:");
		      item = input.nextInt();

		      for (c = 0; c < num; c++)
		      {
		         if (arr[c] == item) 
		         {
		           System.out.println(item+" element is present at location "+(c+1));
		        
		           break;
		         }
		      }
		      if (c == num)
		        System.out.println(item + " element is not present in array.");
		   }
		}