package com.syntax.class20;

import java.lang.management.GarbageCollectorMXBean;

public class Task2 {
	// Write a java program of Class Students that takes students name and 3 subject
	// grades. Inside your class also have a method to Calculate Average Grade. Test
	// Student class for 5 different students with different marks. Your program
	// should print an average mark of each students name.

	String name;
	int gradeMath, gradeGeo, gradeIT;

	Task2(String studentName, int studentGradeMath, int studentGardeGeo, int studentGradeIT) {
		name = studentName;
		gradeMath = studentGradeMath;
		gradeGeo = studentGardeGeo;
		gradeIT = studentGradeIT;
	}

	public int calculateAverageGrade(  ) {
		int average=(gradeGeo+gradeMath+gradeIT)/3;
		return average;
	}

}
