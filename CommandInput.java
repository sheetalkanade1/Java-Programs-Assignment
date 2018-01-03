//Write a program  that accepts input from the command line and then prints them.
package com.sheetal;

public class CommandInput {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total = total + Integer.parseInt(args[i]);
		}
		System.out.println("The total of the arguments passed is " + total);
	}
}
