//Write a program to merge 2 arrays.
package com.sheetal;

public class ArraysMerge {
	
		   public static void main(String[] args) {
		      String[]a = {"i like java"};
		      String[]b = {"programming"};
		      String[]c = new String[a.length+b.length];
		     
		      int count = 0;
		      
		      for(int i = 0; i<a.length; i++) { 
		         c[i] = a[i];
		         count++;
		      } 
		      for(int j = 0; j<b.length; j++) { 
		         c[count++] = b[j];
		      } 
		      for(int i = 0; i<c.length; i++) 
		    	  System.out.println(c[i]+" ");
		   } 
		}

