package com.syntax.class15;

public class StringMethods {
	public static void main(String[] args) {
		System.out.println("*******.replace() method*******");

		String me = "I am a good tester. I am a good person";
		String str = "Hello";
		str = str.replace('e', 'E');
		System.out.println(str);
		
		me = me.replace("good", "great");
		System.out.println(me);
		
		me = me.replace("we", "us"); // if it finds it --> it replaces. If it not --> does nothing
		System.out.println(me);
		
		String fromApplication = "Phone number is 123456789";
		
		System.out.println("*******.replace() method*******");
		fromApplication = fromApplication.replaceAll("[A-Z]", ""); // hone number is 123456789
		System.out.println(fromApplication);
		
		fromApplication = fromApplication.replaceAll("[a-z]", "").trim();
		System.out.println(fromApplication); //    123456789
		
		String another = "Hello 12345";
		int num = Integer.parseInt(another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "").trim());
		System.out.println(num);
		
		String mix = "hello7568 friends 657455";
		mix = mix.replaceAll("[0-9]", ""); 
		System.out.println(mix);
		
		String mix1 = "hello7568 friends 657455";
		mix1 = mix1.replaceAll("[6-9]", ""); 
		System.out.println(mix1);
		
		String mix2 = "hello7568 friends 657455";
		mix2 = mix2.replaceAll("[h-z]", ""); 
		System.out.println(mix2);
		
		String mix3 = "hello3434&*^%$$(@)$(*%34234(**&^JJN";
		mix3 = mix3.replaceAll("[^A-Za-z0-9]", "A"); // why it left % and $
		System.out.println(mix3);
		
		System.out.println("*******.replace() method*******");
		
	}

}
