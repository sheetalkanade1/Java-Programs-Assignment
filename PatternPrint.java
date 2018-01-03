/*Write a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		*******/
package com.sheetal;

public class PatternPrint  {

	public static void main(String args[]) {
		System.out.println("Pyramid pattern of star in Java : "); 
		drawPyramidPattern();
	}

	public static void drawPyramidPattern() { 
		for (int i = 0; i <= 5; i++) { 
			for (int j = 0; j < i; j++) { 
				System.out.print("* ");
				} 
				System.out.println(" "); 
				} 
			
		}

	}
