/*Write a program to depict the behavior of method overloading and overriding.
 * When a class has more than one method with same name but with different arguments, then we call it as method overloading.
 */
package com.sheetal;

public class OopsOverloading {

	public static void main(String args[]) {
		System.out.println(fruits("Apple","Mango"));
		System.out.println(fruits("Z","Orange","sweet"));
	}

	public static String fruits(String a, String c) {
		return a+c;
	}
	public static String fruits(String c, String b, String d){
		return c+b+d;
	}
}