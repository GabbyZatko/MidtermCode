package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {


	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	
	static ArrayList<Enrollment> ECONF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> ECONS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CISCF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CISCS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CALCF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CALCS = new ArrayList<Enrollment>();


	public static Date studDate(int year, int month, int day) 
	{
		Calendar CalB = Calendar.getInstance();
		CalB.set(year, month, day);
		return CalB.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {

		Course ECON = new Course(UUID.randomUUID(), "Macroeconomics", 100, eMajor.BUSINESS);
		Course CISC = new Course(UUID.randomUUID(), "Intro to Java", 100, eMajor.CHEM);
		Course CALC = new Course(UUID.randomUUID(), "Calculus B", 100, eMajor.PHYSICS);
	}


	public static void MajorChange(eMajor major, Student student) 
	{
		student.setMajor(major);
	}

	@Test
	public void MajorChangeTest() 
	{
		MajorChange(eMajor.CHEM, students.get(5));
		assertEquals(eMajor.CHEM, students.get(5).getMajor());
	}

}