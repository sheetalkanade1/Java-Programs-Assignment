//Write a program to find the missing number in a series of sorted numbers stored in an array.
package com.sheetal;

public class ArrayMissingNumber {

	static int sumOfNumbers(int n) {
		int sum = (n * (n + 1)) / 2;

		return sum;
	}

	// Method to calculate sum of all elements of array

	static int sumOfElements(int[] a) {
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}

		return total;
	}

	public static void main(String[] args) {
		int n = 8;

		int[] a = { 1, 3, 4, 5, 6, 7, 8 };

		int sumOfNumbers = sumOfNumbers(n);
		int sumOfElements = sumOfElements(a);
		int missingNumber = sumOfNumbers - sumOfElements;

		System.out.println("Missing Number in array is = " + missingNumber);
	}
}
