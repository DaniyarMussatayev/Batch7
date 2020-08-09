package com.syntax.class30;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> food = new LinkedList<>();
		food.add("pizza");
		food.add("tacos");
		food.add("biryani");
		
		String myFood=food.get(2);
		System.out.println(myFood);
		
		LinkedList<String> desert = new LinkedList<>();
		desert.add("cake");
		desert.add("ice cream");
		desert.add("cookies");
		
		food.addAll(desert);
		System.out.println(food);
		
		food.remove("pizza");
		System.out.println(food);
		
		food.set(3, "brownie");
		System.out.println(food);
		
		
	}

}
