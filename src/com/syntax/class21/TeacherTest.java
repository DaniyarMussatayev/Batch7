package com.syntax.class21;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher teacher =new Teacher();
		teacher.name="James";
		teacher.lastName="Frostol";
		teacher.yearOfExperience=10;
		teacher.displayTeaching();
		
		ChemistryTeacher chem =new ChemistryTeacher();
		chem.name="Dean";
		chem.lastName="Martin";
		chem.yearOfExperience=20;
		chem.degree="Bachelor";
		chem.displayTeaching();
		chem.displayChemestry();
		
		PianoTeacher pian =new PianoTeacher();
		pian.name="Dean";
		pian.lastName="Martin";
		pian.yearOfExperience=20;
		pian.instrument="Piano";
		pian.numOfGroups=3;
		pian.displayTeaching();
		pian.displayPianoTecher();
		
		MathTeacher math =new MathTeacher();
		math.name="Dean";
		math.lastName="Martin";
		math.yearOfExperience=20;
		math.mathEducation="MIT";
		math.responsibility=true;
		math.displayTeaching();
		math.displayKnowledge();
		
		
	}

}
