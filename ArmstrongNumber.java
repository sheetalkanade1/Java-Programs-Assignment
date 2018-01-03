/*Write a program  to check an armstrong number i.e. whether the if we power up the each individual number to the total number of digits in the number and add them it should be equal to the number itself. For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
    		FYI: ^ means is to the power.153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  */

package com.sheetal;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args)  {  
	    int c=0,a,temp;  
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = s.nextInt();
        temp=n;
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("This is a armstrong number");   
	    else  
	        System.out.println("This is Not a armstrong number");   
	   }  
	}  

