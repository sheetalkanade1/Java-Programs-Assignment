//Write a program  to calculate factorial of a given number. You need to compute the factorial with one logic that uses recursion .
package com.sheetal;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		int factorial = fact(number);
		System.out.println("Factorial of entered number is: " + factorial);
	}

	static int fact(int n) {
		int output;
		if (n == 1) {
			return 1;
		}
		// Recursion: Function calling itself
		output = fact(n - 1) * n;
		return output;
	}
}
