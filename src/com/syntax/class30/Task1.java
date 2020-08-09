package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
//	Create an arraylist of cars and retrieve all the values using 3 different ways.
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Tesla");
		cars.add("BMW");
		cars.add("Mini");
		cars.add("Audi");
		
		System.out.println("---- retrieve for loop--");
		for (int i=0;i<cars.size();i++) {
			String c=cars.get(i);
			System.out.print(c+" ");
		}
		
		System.out.println();
		System.out.println("---- retrieve enhanced for loop--");
		for (String s:cars) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("---- retrieve using iterator--");
		Iterator<String> it = cars.iterator();
		while(it.hasNext()) {
			String c1=it.next();
			System.out.print(c1+" ");
		}
		
		
		

	}

}
