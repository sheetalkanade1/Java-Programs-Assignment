/* Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement.
 * i have used recursion in which a method calls itself to solve some problem
 */
package com.sheetal;

public class PrintWithoutLoop {
	public static void main(String[] args) {
		int n=1;
		
		recursion(n);
		
				

	}
public static void recursion(int number){
	  if(number>10)
		 return;
	System.out.println(number);
    recursion(number+1);
	
	
}

} 