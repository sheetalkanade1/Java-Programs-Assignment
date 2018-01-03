/*Write a program containing a function which is expected to throw any kind of exception say 
 * NullPointerException or ArithmeticException(built-in-class present in java.lang package. This exception occurs when an integer is divided by zero.) etc 
 * and then handle this function in the parent function which calls this function.
 */
		
		
package com.sheetal;

public class ExceptionHandling {
	public static void main(String args[])
	   {
	      try{
	         int a=30, b=0;
	         int output=a/b;
	         System.out.println ("output: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("caught exception as a number cannot get divided by zero");
	      }
	   }
	}

