package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task3 {
	public static void main(String[] args) {
		// Create a Set collection that will hold Objects of Student Type. \
		// In this set we do not care about the insertion order.
		// Each student object should have name and studentID. Display name of each
		// student.
		
		HashSet<String> student=new HashSet<>();
		student.add("Name = Nick, studentID = 001");
		student.add("Name = Bill, studentID = 002");
		student.add("Name = Sam, studentID = 003");
		student.add("Name = Jorge, studentID = 004");
		
		
		Iterator<String> it=student.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
