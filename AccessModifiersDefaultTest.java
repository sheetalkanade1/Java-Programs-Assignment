/* It will throw error because we are trying to access the default method in another package */
package com.sheetal;

public class AccessModifiersDefaultTest {
	
		   public static void main(String args[]){
			   AccessModifiersDefault obj = new AccessModifiersDefault();
		        
			obj.addNumbers(10, 21);
		   }
		}

