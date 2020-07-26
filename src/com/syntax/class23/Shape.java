package com.syntax.class23;

//Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 
//In circle class create a method to calculate the area of circle. Test your code
public class Shape {
	double radius;
	public Shape(double radius) {
		this.radius=radius;
	}
}
class Circle extends Shape{
	public Circle(double radius) {
		super(radius);
	}
	public void calculateArea() {
		double  area1=(22*radius*radius)/7 ;
		System.out.println(area1);
	}
}
