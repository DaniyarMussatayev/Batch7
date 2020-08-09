package com.syntax.class29;

import java.util.ArrayList;

//Create an ArrayList that will store 5 names into it. 
//Find out whether the given ArrayList is empty or not? 
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that
public class Task {
	public static void main(String[] args) {
		ArrayList<String> names =new ArrayList<>();
		names.add("Bill");
		names.add("John");
		names.add("Ed");
		names.add("Paul");
		names.add("Piter");
		System.out.println("Array is empty? " +names.isEmpty());
		System.out.println("Elements of names ="+names.size());
		System.out.println(names);
		


		

		

		
	}

}
