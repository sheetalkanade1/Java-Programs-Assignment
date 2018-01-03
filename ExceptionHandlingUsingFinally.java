/*Exception Handling: Following programs illustrates how to work around exceptions.
 * Write a program that is expected to throw a null pointer exception and in turn handles it using try catch and finally.
 * Java finally block is always executed whether exception is handled or not.Java finally block follows try or catch block.
 */

  		
package com.sheetal;

public class ExceptionHandlingUsingFinally {
	static void myMethod(int testnum) throws Exception {
	     
	      if (testnum == 12) 
	         throw new Exception();
	     
	      return;	
	   }
	   public static void main(String  args[]) {
	      int testnum = 12;
	      try {
	        
	         myMethod(testnum);
	         System.out.println("try to excecute statement");
	      }
	      catch ( Exception ex) {
	         System.out.println("An Exception is caught");
	      }
	      finally {
	         System. out. println( "finally") ;
	      }
	      
	   }
	}