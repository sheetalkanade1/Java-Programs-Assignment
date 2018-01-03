//Write a program  to calculate factorial of a given number. You need to compute the factorial without recursion
//factorial is a function that multiplies a number by every number below it. For example 4!= 4*3*2*1=24
package com.sheetal;

import java.util.Scanner;

public class FactorialWithoutRecursion {
	public static void main(String[] args) 
    {
        int n, num = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        n = s.nextInt();
        for(int i = 1; i <= n; i++)
        {
            num = num * i;
        }
        System.out.println("Factorial of "+n+" :"+num);
    }
}

