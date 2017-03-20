package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

		private UUID SectionID;
		private UUID StudentID;
		private UUID EnrollmentID;
		private double Grade;

		private Enrollment() {

		}

		public Enrollment(UUID SectionID, UUID StudentID) {
			this.SectionID = SectionID;
			this.StudentID = StudentID;
			this.setEnrollmentID(UUID.randomUUID());
		}

		public void setGrade(double grade) {
			Grade = grade;
		}

		public double getGrade() {
			return Grade;
		}

		public void setEnrollmentID(UUID enrollmentID) {
			EnrollmentID = enrollmentID;
		}

		public UUID getStudentID() {
			return StudentID;
		}

		public UUID getSectionID() {
			return SectionID;
		}
}

