package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	// no-arg Constructor
	private Enrollment() {
		
	}
	
	// two-args Constructor
	Enrollment(UUID StudentID, UUID SectionID, UUID EnrollmentID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.setEnrollmentID(EnrollmentID);
	}

	// Setter and Getter
	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

}
