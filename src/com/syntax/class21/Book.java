package com.syntax.class21;

public class Book {
	//Write program as a Book class   that will have instance variables and 2 Constructors. While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed
	String name;
	double price;
	
	Book(){
		this("Harry Potter", 2.99);
		System.out.println();
	}
	
	Book (String name, double price){
		this.name=name;
		this.price=price;
		System.out.println(name + " is cost " + price +"$");
	}
//	void displayInfo() {
//		System.out.println(name + " is cost " + price +"$");
//	}
	public static void main(String[] args) {
		Book obj =new Book();
		
	}
	
	

}
