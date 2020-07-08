package com.syntax.class18;
//create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to “Sumair” 
//Create two objects of the class Employee 
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects

public class Employee {
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.eID = 17;
		obj1.salary = 80000;
		System.out.println("eID is " + obj1.eID);
		System.out.println("salary is "+obj1.salary);
		System.out.println("CEO is" +Employee.CEO);
		
		Employee obj2 =new Employee();
		obj2.eID = 6;
		obj2.salary = 90000;
		System.out.println("eID is " + obj2.eID);
		System.out.println("salary is "+obj2.salary);
		System.out.println("CEO is" +Employee.CEO);
	}
	
	
	
	int eID;
	int salary;
	static String CEO = "Sumair";

}
