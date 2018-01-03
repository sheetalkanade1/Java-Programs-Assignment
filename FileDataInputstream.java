/*Write a program that takes input from user dynamically using below classes.
datainputStream: Use this class to input 2 integer numbers and multiply them.
readLine() method of DataInputStream reads a line at a time and returns as a string, irrespective of what the line contains. 
Depending on the input value, the string is to be parsed into an int or double etc. */
package com.sheetal;

import java.io.DataInputStream;

public class FileDataInputstream {
	@SuppressWarnings("deprecation")
	public static void main(String[] as) {
		try {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter number1:");
			int a = Integer.parseInt(dis.readLine());
			System.out.println("Enter number2:");
			int b = Integer.parseInt(dis.readLine());
			int multiple = a * b;
			System.out.println("Multiple of 2 numbers is " + multiple);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}