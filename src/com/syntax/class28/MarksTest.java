package com.syntax.class28;

public class MarksTest {
	public static void main(String[] args) {
		Marks s=new A(56, 60, 100);
		System.out.println(s.getPercentage());
		
		Marks s1=new B(86, 84, 60,77);
		System.out.println(s1.getPercentage());
	}

}
