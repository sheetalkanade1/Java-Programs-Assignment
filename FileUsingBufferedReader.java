/*Write a program that takes input from user dynamically using below classes.
// --> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
Java.io.InputStreamReader class is a bridge from byte streams to character streams.
It reads bytes and decodes them into characters using a specified charset*/

package com.sheetal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUsingBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader add = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number1: ");
		int num1 = Integer.parseInt(add.readLine());
		System.out.println("Enter number2: ");
		int num2 = Integer.parseInt(add.readLine());
		int sum = num1 + num2;
		System.out.println("The sum is  : " + sum);
	}
}