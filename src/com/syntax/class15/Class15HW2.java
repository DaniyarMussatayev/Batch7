package com.syntax.class15;

public class Class15HW2 {
	public static void main(String[] args) {
		//How would you reverse a String word by word?
		String original ="How would you reverse a String word by word ?";
		String [] array = original.split(" ");
		for (int i =array.length-1; i >=0;i--) {
			System.out.print(array[i] + " ");
		}

	}
}
