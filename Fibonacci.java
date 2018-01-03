// Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.

package com.sheetal;

public class Fibonacci {
	
	public static void main(String[] args) {

        int n = 10, f1 = 0, f2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(f1 + " , ");

            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
    }
}
