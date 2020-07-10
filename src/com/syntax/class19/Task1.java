package com.syntax.class19;

public class Task1 {
	// Create a method that will accept an array as parameters and will return a sum
	// of all elements from that array.
	// Method should be visibly only within same package and accessible by the
	// creating an instance of the class.
	

	
	private int myMethod(int[] arr) {
		int total =0;
		for(int element:arr) {
			total=total+element;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 1 };

		Task1 obj =new Task1();
		System.out.println(obj.myMethod(arr));
	}
}
