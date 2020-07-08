package com.syntax.class03;

public class BooleanIfCondition {
	public static void main(String[] args) {
		boolean flag = true;
		if (flag == true) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}
		System.out.println(flag);
		System.out.println("--------------");
		
		//another way
		if (flag) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}
		
		System.out.println(flag);
		System.out.println("--------------");
		//another way
		//I exclamation mark will reverse the condition/the opposite of the condition
				if (!flag) {
					System.out.println("Hi");
				} else {
					System.out.println("Bye");
				}
				
				System.out.println(flag);
				System.out.println("--------------");
	}
}
