package com.syntax.class26;

//Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour: 
//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

abstract public class File {
	abstract public void open();
	
	
	 public void edit() {
		 System.out.println("File can be edited by edit button");
	 }
	 
	 public void close() {
		 System.out.println("File can closed by X button on the top of the corner");
	 }
}

class JavaFile extends File{
	public void open() {
		System.out.println("To open .java file we need notepad++");
	}	
}

class WordFile extends File{
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed");
	}	
}
class PdfFile extends File{
	public void open() {
		System.out.println("To open .pdf file we need Adobe to be installed");
	}	
}
