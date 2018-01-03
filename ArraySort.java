//Write a program to sort an array
//i am using bubblesort here in which repeatedly steps through the list to be sorted, 
//5compares each pair of adjacent items and swaps them if they are in the wrong order.
package com.sheetal;

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) 
    {
        int num, temp;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.print("Enter total number of elements to sort in a array:");
        num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < num - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[num - 1]);
    }

}
