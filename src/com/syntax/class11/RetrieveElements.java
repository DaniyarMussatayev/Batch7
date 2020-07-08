package com.syntax.class11;

public class RetrieveElements {
	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println("--Print using advanced/enhanced, for each loop--------");

		for (char grade : grades) {
			System.out.println(grade);
		}

	}

}
