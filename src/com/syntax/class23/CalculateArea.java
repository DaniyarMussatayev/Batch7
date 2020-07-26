package com.syntax.class23;

//Create 1 class in which create a methods that will calculate the area (volume) of 
//Rectangle
//Square
//Box
//Use separate class to test your code
public class CalculateArea {
	public int areaRectungle(int length, int width) {
		return length*width;
	}
	
	public int areSquare(int length) {
		return length*length;
	}
	public int areBox(int length, int width, int height) {
		return (2*length*width)+(2*length*height)+(2*width*height);
	}
	public int volume(int length, int width, int height) {
		return length*width*height;
	}

}
