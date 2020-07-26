package com.syntax.class28;

//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. 
//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
public interface Shape {
	void calculateArea();
	void calculatePerimiter();
}

class Circle implements Shape{
	
	public void calculateArea() {
		double radius= 4;
		double  area=(22*radius*radius)/7 ;
		System.out.println(area);
	}
	
	public void calculatePerimiter() {
		double radius= 7;
		double  perimiter=(22*2*radius)/7 ;
		System.out.println(perimiter);
	}
}
class Square implements Shape{
	double side= 2;
	public void calculateArea() {
		
		double  area=side*side;
		System.out.println(area);
	}
	
	public void calculatePerimiter() {
		double  perimiter=4*side;
		System.out.println(perimiter);
	}
}