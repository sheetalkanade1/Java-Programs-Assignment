//throws compilation error because we are trying to access the private data member and method of class AccessModifierPrivateTest{ in the class Example.
//The private data member and method are only accessible within the class.
package com.sheetal;

public class AccessModifierPrivateTest{ 
private char[] data;

public static void main(String args[]){  
	AccessModifierPrivateTest obj=new AccessModifierPrivateTest();  
	   System.out.println(obj.data);//Compile Time Error  
	   obj.msg();//Compile Time Error  
	   }

private void msg() {
	// TODO Auto-generated method stub
	
}  
	}  