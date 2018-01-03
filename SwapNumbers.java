//Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
//without using temp variable using XOR operator
package com.sheetal;

public class SwapNumbers {
	
	public static void main (String[] args)
	   {
	      int i = 5, j = 10;
	      i = i ^ j ^ (j = i);
	      System.out.println("New values of i and j are "+ i + ", " + j);
	   }
	} 
