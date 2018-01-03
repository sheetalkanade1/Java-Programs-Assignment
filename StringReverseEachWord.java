//Write a program to reverse each individual word in a sentence.
package com.sheetal;

public class StringReverseEachWord {
	public static void main(String[] args)
    {
        String str = "i like java";
 
        StringBuilder str1 = new StringBuilder();
 
        str1.append(str);
        str1 = str1.reverse();
        for (int i=0; i<str1.length(); i++)
            System.out.print(str1.charAt(i));
    }
}
