/*Write a program that contains a constructor, a static block 
 * and a static method. Execute the program in order to verify the order to execution of methods and block.
 * Static Block is used to initialize or change the java default static variables. 
 * Static block in java is executed before main method 
 * static method always access static data and it is also belongs to class not instance
 * static methods in Java can be called without creating an object of class.
 * constructor in Java is a block of code similar to a method that's called when an instance of an object is created and it doesn't have return type*/

package com.sheetal;

public class StaticExample {
	static int i=4;

	static {
		System.out.println("static block");
	}
	public StaticExample() {
		System.out.println("I am in constructor");
	}
	static void display() {
		System.out.println("static method is executed.");
	}
	public static void main(String a[]) {
		System.out.println(StaticExample.i); 
		display();
		new StaticExample();
	}

}
