//Write a program to find the largest number in a given array.
package com.sheetal;

public class ArrayLargestNumber {
	
	public static void main(String[] args) 
	{
		int a[] = new int[] { 567, 432, 7, 876, 879, 44, 1};

		int max = a[0]; 

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
		}

		System.out.println("Largest Number is : " + max);
		}

}