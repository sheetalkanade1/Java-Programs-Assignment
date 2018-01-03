/*Write a program that creates a class Circle extending Shape abstract class and implementing ShapeConstants interface
 * --> Properties: radius.
 --> Constructor: To set number of sides.
--> Overrides all the methods from parents.
 */
package com.sheetal;

abstract class CircleShape {
	public abstract double area();

	public abstract double circumference();

}

interface ShapeConstants {
	static final double pi = 3.14;
}

class Circle extends CircleShape implements ShapeConstants {

	public int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public double area() {
		double area = pi * radius * radius;
		return area;
	}

	public double circumference() {
		double circum = 2 * pi * radius;
		return circum;
	}

}

public class OopsAbstractInterface {
	public static void main(String[] args) {
		Circle circle = new Circle(8);

		System.out.println("Circle Area is: " + circle.area());
		System.out.println("Circle circumference is: " + circle.circumference());
	}

}