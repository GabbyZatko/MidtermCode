package com.cisc181.core;

import java.sql.Date;
import java.util.UUID;

public class Semester {
	
	public UUID SemesterID;
	public Date StartDate;
	public Date EndDate;
	public Semester(UUID randomUUID, java.util.Date studDate, java.util.Date studDate2) {
		// TODO Auto-generated constructor stub
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	

}
