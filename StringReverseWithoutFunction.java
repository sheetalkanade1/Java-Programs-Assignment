//Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.
//here i am using getBytes() method to convert stirng to bytes
package com.sheetal;

public class StringReverseWithoutFunction {
	public static void main(String[] args)
    {
        String input = "Java Code";
 
        byte [] stringRev = input.getBytes();
        byte [] strResult = new byte [stringRev.length];
        for (int i = 0; i<stringRev.length; i++)
            strResult[i] =  stringRev[stringRev.length-i-1];
 
        System.out.println(new String(strResult));
    }
}


