package com.syntax.class14;

import java.util.Scanner;

public class HM1 {
	
		public static void main(String[] args) {
//			 Write a program that reads two people's first
//			names and if they expecting boy or girl? 
//			Based on the input suggests a name for a baby:
//			Example Output:
//			Mom’s first name? Mary
//			Dad’s first name? Daniel
//			Boy or Girl? boy
//			Suggested baby name: DANRY
	//
//			Example Output:
//			Mom’s first name? Mary
//			Dad’s first name? Daniel
//			Boy or Girl? girl
//			Suggested baby name: MAIEL
			
			
//			String momName = "Mary";
//			String dadName ="Daniel";
//			String dadBoySubstring = dadName.substring(0, 3);
//			String momBoySubstring = momName.substring(2,4);
//			String dadGirlSubstring = dadName.substring(3,6);
//			String momGirlSubstring = momName.substring(0,2);
//			Boolean boy = false;
//			if(boy) {
//				System.out.println((dadBoySubstring.concat(momBoySubstring)).toUpperCase());
//			}else {
//				System.out.println((momGirlSubstring.concat(dadGirlSubstring)).toUpperCase());
//			}
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Mom’s first name?");
			String mom = scan.nextLine();
			System.out.println("Dad's first name?");
			String dad = scan.nextLine();
			System.out.println("Boy or Girl?");
			String boyOrGirl = scan.nextLine();
			
			if(boyOrGirl.equals("Boy")){
				System.out.println((dad.substring(0, dad.length()/2).concat(mom.substring(mom.length()/2))).toUpperCase());
			}else {
				System.out.println((mom.substring(0, mom.length()/2).concat(dad.substring(dad.length()/2))).toUpperCase());
				
			}
		}
	}


