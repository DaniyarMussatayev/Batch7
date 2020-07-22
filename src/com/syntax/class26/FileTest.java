package com.syntax.class26;

public class FileTest {
	public static void main(String[] args) {
		File f=new JavaFile();
		f.open();
		f.edit();
		f.close();
		
		System.out.println("==============");
		File f1=new WordFile();
		f1.open();
		f1.edit();
		f1.close();
		
		System.out.println("==============");
		File f2=new PdfFile();
		f2.open();
		f2.edit();
		f2.close();
	}


}
