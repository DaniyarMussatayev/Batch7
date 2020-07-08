package com.syntax.class12;

public class ClassTask {
	public static void main(String[] args) {
		String[][] food = {
				{"pelmeni", "uha", "kotlety"},
				{"manty", "kuurdak", "lagman"},
				{"chorba", "pilav"},
				
		};
		
		for (int i = 0; i < food.length; i++) {
			for (int j = 0; j < food[i].length; j++) {
				System.out.print(food[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*************");
		for (String[] array:food) {
			for (String array1:array) {
				System.out.print(array1 + " ");
			}
			System.out.println();
		}
	}

}
