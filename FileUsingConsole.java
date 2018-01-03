/*Write a program that takes input from user dynamically using below classes.
--> Console: Use this class to input 2 integer numbers and divide them.
console class helps to  read input from the user in the command line.*/
package com.sheetal;

import java.io.Console;

public class FileUsingConsole {
	public static void main(String[] as) {
		Console console = System.console();
		if (console == null) {
			System.out.print("console not available ");
		} else {
			System.out.println("Enter num1: ");
			int num1 = Integer.parseInt(console.readLine());
			System.out.println("Enter num2: ");
			int num2 = Integer.parseInt(console.readLine());

			int divide = num1 / num2;
			System.out.print("Divide number is :" + divide);
		}
	}
}