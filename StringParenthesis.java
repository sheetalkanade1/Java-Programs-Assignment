/* Write a program to check if a given string of parenthesis has balanced parenthesis or not.
For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings.
Declare a character stack S.
2) Now traverse the expression string exp.
    a) If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
    b) If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine else parenthesis are not balanced.
3) After complete traversal, if there is some starting bracket left in stack then “not balanced” */
package com.sheetal;

import java.util.Scanner;
import java.util.Stack;

public class StringParenthesis {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("Enter the String/Expression");
		
		String regEx=sc.nextLine();
		for(int i=0;i<=regEx.length()-1;i++){
			char ch=regEx.charAt(i);
			if(ch== '(')
				stack.push(i);
			else if(ch==')'){
			try{		
			int p=stack.pop()+1;
			System.out.println("Expression is matching");	
			}
		catch(Exception e){
			System.out.println("Expression is not matching");
		}
			
	}}

		 while (!stack.isEmpty() )
	            System.out.println("'(' at index "+(stack.pop() +1)+" is not matched");
		 sc.close();
}
}

