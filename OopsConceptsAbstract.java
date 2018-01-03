/*Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) 
 * and methods(calculateArea,calculatePerimeter,setSides.
 * An abstract method is a method that is declared, but contains no implementation. 
 * Abstract classes may not be instantiated, and require subclasses to provide implementations for the abstract methods.
 */
package com.sheetal;

public abstract class OopsConceptsAbstract {
	public abstract double area();

	public abstract double perimeter();

}

class Rectangle extends OopsConceptsAbstract {
	private final double width, height;

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;

	}

	public double perimeter() {
		System.out.println("Rectangle perimeter: ");
		return 2 * (width + height);
	}

	public double area() {
		System.out.println("Rectangle area:");
		return width * height;
	}

	public static void main(String[] args) {
		double width = 3;
		double height = 5;

		Rectangle rectangle = new Rectangle(width, height);
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());

	}
}
