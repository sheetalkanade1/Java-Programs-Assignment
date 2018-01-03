/*Write an Immutable class.
String is an immutable class and once instantiated its value never changes.
Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Make all mutable fields final so that it’s value can be assigned only once.
*/
package com.sheetal;

public class Immutable {
	public final class Employee{  
		final String drivingLicenceNumber;  
		  
		public Employee(String drivingLicenceNumber){  
		this.drivingLicenceNumber=drivingLicenceNumber;  
		}  
		  
		public String getPancardNumber(){  
		return drivingLicenceNumber;  
		}  
		  
	}
}