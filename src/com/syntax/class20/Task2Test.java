package com.syntax.class20;

public class Task2Test {
	public static void main(String[] args) {
		Task2 obj1 = new Task2("Leo", 20, 30, 70);
		Task2 obj2 = new Task2("Mike", 60, 50, 70);
		Task2 obj3 = new Task2("Joe", 80, 57, 75);
		Task2 obj4 = new Task2("Sail", 80, 90, 48);
		System.out.println("Student average grade is " +obj1.calculateAverageGrade());
		System.out.println("Student average grade is " +obj2.calculateAverageGrade());
		System.out.println("Student average grade is " +obj3.calculateAverageGrade());
		System.out.println("Student average grade is " +obj4.calculateAverageGrade());
	}
}
