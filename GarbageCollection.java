/*Write a program implementing explicit garbage collection.
 * we can explicitly call garbage collector using System.gc();
But we can't order JVM to do garbage collection immediately. JVM decides on its own when to garbage collect.
in below program finalize() method is not at all called by the garbage collector thread. 
*/
package com.sheetal;

class X {
	int i = 50;

	protected void finalize() throws Throwable {
		System.out.println("check if this method is called");
	}
}

public class GarbageCollection {
	public static void main(String[] args) {
		X a2 = new X();
		System.out.println("done");
	}
}