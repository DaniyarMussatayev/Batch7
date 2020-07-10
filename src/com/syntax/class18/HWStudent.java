package com.syntax.class18;

public class HWStudent {
	String studentName;
	int studentID;
	static int numbersOfStudents = 0;

	public static void main(String[] args) {
		HWStudent obj = new HWStudent();
		obj.studentName = "Mike";
		obj.studentID = 12;
		numbersOfStudents++;

		System.out.println("The name of the student is " + obj.studentName + " and student ID is " + obj.studentID
				+ " and total numbers of students is "+ numbersOfStudents);

		HWStudent obj1 = new HWStudent();
		obj1.studentName = "Alan";
		obj1.studentID = 144;
		numbersOfStudents++;
		System.out.println("The name of the student is " + obj1.studentName + " and student ID is " + obj1.studentID
				+ " and total numbers of students is " + numbersOfStudents);

		HWStudent obj2 = new HWStudent();
		obj2.studentName = "Brad";
		obj2.studentID = 555;
		numbersOfStudents++;
		System.out.println("The name of the student is " + obj2.studentName + " and student ID is " + obj2.studentID
				+ " and total numbers of students is " + numbersOfStudents);
	}

}
