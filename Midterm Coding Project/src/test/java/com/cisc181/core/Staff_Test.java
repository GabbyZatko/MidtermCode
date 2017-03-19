package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;


public class Staff_Test {
	
	public static Date staffDate(int year, int month, int day)
	{
		Calendar Cals = Calendar.getInstance();
		Cals.set(year,  month, day);
		return Cals.getTime();
	}
	
	static ArrayList<Staff> StaffMembers = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() throws PersonException
	{
		StaffMembers.add(new Staff("Gabby", "K", "Zatko", staffDate(1987, 2, 8), "158 Dorset Dr", "3021234567", "gabby@aol.com",  "Gabby: Mon 2-4", 1, 30000, staffDate(2000, 7, 17), eTitle.MRS));
		StaffMembers.add(new Staff("John", "J","Johnson", staffDate(1990, 11, 11), "316 West Lane", "(267)-714-5600", "john@udel.edu", "The John: Sat 1-4", 3, 62100, staffDate(1993, 5, 30), eTitle.MR));
		StaffMembers.add(new Staff("Joshua", "D", "Ferreira", staffDate(1899, 6, 12), "32 Main Street", "(911)-249-7760", "joshua@yahoo.com", "Joshua: Tues 7-9", 3, 25400, staffDate(1999, 1, 15), eTitle.MR));
		StaffMembers.add(new Staff("Cathy", "Mia", "Bozzone", staffDate(1971, 4, 12), "451 Bellair Avenue", "(678)-999-8212", "cathy@gmail.com", "Cathy: Wed 5-6", 6, 45000, staffDate(1980, 3, 24), eTitle.MRS));
		StaffMembers.add(new Staff("Veronica", "Victoria", "Green", staffDate(1994, 5, 28), "1150 Pine Lane", "(512)-090-6018", "veronica@hotmail.com", "Land: Fri 10-1", 2, 71300, staffDate(2013, 12, 5), eTitle.MS));
	}
	
	@Test
	public void SalaryTest() throws PersonException 
	{
		double sum = 0;
		for (Staff i : StaffMembers) 
		{
			sum += i.getSalary();
		}
		double avgSalary = sum / StaffMembers.size();
		assertEquals(avgSalary, 46760, 0.01);
	}	
	
	@Test
	public void DOBExceptionTest() throws PersonException 
	{
		new Staff("Joshua", "D", "Ferreira", staffDate(1899, 6, 12), "32 Main Street", "(911)-249-7760", "joshua@yahoo.com", "Joshua 7-9", 3, 25400, staffDate(1999, 1, 15), eTitle.MR);
	}

	@Test
	public void PhoneExceptionTest() throws PersonException 
	{
		new Staff("Gabby", "K", "Zatko", staffDate(1987, 2, 8), "158 Dorset Dr", "3021234567", "gabby@aol.com",  "Gabby: Mon 2-4", 1, 30000, staffDate(2000, 7, 17), eTitle.MRS);
	}
}
