/* Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
First divide the array, 
using temp for swapping first half of second array,
Next swapping second half for first array
we can also use linked list*/

package com.sheetal;

import java.util.Arrays;

public class CollectionsInputOutput {
	static void shufleArray(int a[], int x, int y) {
		// If only 2 element, return
		if (y - x == 1)
			return;

		int mid = (x + y) / 2;
		int temp = mid + 1;

		int mmid = (x + mid) / 2;

		for (int i = mmid + 1; i <= mid; i++) {

			int temp1 = a[i];
			a[i] = a[temp];
			a[temp++] = temp1;
		}

		shufleArray(a, x, mid);
		shufleArray(a, mid + 1, y);
	}

	public static void main(String[] args) {
		int a[] = { 1, 6, 3, 5, 2, 4, 7, 8 };

		shufleArray(a, 0, a.length - 1);

		System.out.println(Arrays.toString(a));
	}
}