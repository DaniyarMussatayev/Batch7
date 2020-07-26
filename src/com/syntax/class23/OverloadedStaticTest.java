package com.syntax.class23;

public class OverloadedStaticTest {
	public static void main(String[] args) {
		OverloadedStatic o=new OverloadedStatic();
		o.display(2);
		o.display("Syntax", 7);
		o.display("Java",5,3);
	}
}
