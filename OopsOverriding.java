/*Write a program to depict the behavior of method overloading and overriding.
 * When a super class method is modified in the sub class, then we call this as method overriding.
 */
package com.sheetal;

class parent {
	public void display() {
		System.out.println("Super class");
	}
}

class child extends parent {
	public void display() {
		System.out.println("Sub class");
	}
}

public class OopsOverriding {
	public static void main(String args[]) {
		parent p = new parent();
		parent c = new child();
		p.display();
		c.display();
	}
}
