package com.syntax.class24;

public class StudentTest {
	public static void main(String[] args) {
		Student st =new Student();
		st.study();
		st.rest();
		st.eat();
		
		Student syntaxSt = new SyntaxStudent();
		syntaxSt.study();
		syntaxSt.rest();
		syntaxSt.eat();
		
		Student collegeSt = new CollegeStudent();
		collegeSt.study();
		collegeSt.rest();
		collegeSt.eat();
		
		Student schoolSt = new SchoolStudent();
		schoolSt.study();
		schoolSt.rest();
		schoolSt.eat();
	}

}
