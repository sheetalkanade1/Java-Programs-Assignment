/*Write a program creating an interface ShapeConstants with variable(pi=3.14)
 * All methods in interface are "public abstract" only
 * 
 */
package com.sheetal;

interface Shapes{
	public final double pi=3.14;
	void  circleArea(int radius);
	void CircleCircum(int radius);
	
}

class CirclesShape implements Shapes{
        

	public void circleArea(int radius) {
		double Area=pi*radius*radius;
		System.out.println("Circle Area: "+Area);
	}


	public void CircleCircum(int radius) {
		double circumference=2*pi*radius;
		System.out.println("Circle circumference is: "+circumference);
	}
	
}

public class OopsInterfaceShapeConstants {
	public static void main(String[] args) {
		CirclesShape circle=new CirclesShape();
		circle.circleArea(5);
		circle.CircleCircum(6);
		
	}

}