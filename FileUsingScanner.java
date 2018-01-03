/*Write a program that takes input from user dynamically using below classes.
  	--> Scanner: Use this class to input 2 integer numbers and sum them.
" in" is an object of " InputStream" class defined in System class 
(like "out" is an object of PrintStream class defined in System class). It is declared as static and final object. */
package com.sheetal;

import java.util.Scanner;

public class FileUsingScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int number1 = s.nextInt();
		System.out.print("Enter number2: ");
		int number2 = s.nextInt();
		int sum = number1 + number2;
		System.out.println("The sum is " + sum);
	}
}
