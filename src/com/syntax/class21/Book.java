package com.syntax.class21;

public class Book {
	//Write program as a Book class   that will have instance variables and 2 Constructors. While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed
	String bookName, bookAuthor;
	int bookPages;
	
	public Book() {
		System.out.println("You should read more!");
	}
	
	public Book(String bookName, String bookAuthor, int bookPages) {
		this();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPages = bookPages;
	}
	
	public void display() {
		System.out.println(
				"Try to read " + " " + bookName + " " + " written by " + bookAuthor + ". It takes only " + bookPages + " pages.");
	}
	
	public static void main(String[] args) {
		Book obj = new Book("The Order", "Daniel Silva", 464);
		obj.display();
	}
	

}
