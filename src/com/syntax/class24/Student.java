package com.syntax.class24;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 

//
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism

public class Student {

	public void study() {
		System.out.println("Student must study");
	}

	public void rest() {
		System.out.println("Student should rest");
	}

	public void eat() {
		System.out.println("Student needs to eat");
	}
}

class SyntaxStudent extends Student {
	@Override
	public void study() {
		System.out.println("Student must study hard");
	}

	@Override
	public void rest() {
		System.out.println("Student should rest less");
	}

	@Override
	public void eat() {
		System.out.println("Student needs to eat a lot");
	}

}
class CollegeStudent extends Student{
	@Override
	public void study() {
		System.out.println("Student going to study ");
	}
}

class SchoolStudent extends Student{
	@Override
	public void eat() {
		System.out.println("School student should drink milk more");
	}
}
