/*************************************************************************
* Name: HW 7 Classes And Objects Part 2
* File: ClassSection.java
* Author: Milo Osterman
* Date: 3/26/2021
* Prompt: 
* 
* You have already written a Java class to represent a class section for a course like CIS 131,
* but you must wonder, what about the students who have enrolled in it? We’ll take care of that
* now by creating another class called StudentEnrollee and adding an attribute of an ArrayList
* of this type to class section. Now the complete set of attributes will be:
* 
* 1. CRN, like 20008
* 2. Department code, like CIS
* 3. Course number, like 131
* 4. Instructional mode, like online, on-ground or hybrid
* 5. Meeting days (on-ground and hybrid only, otherwise “N/A”)
* 6. Meeting times (on-ground and hybrid only, otherwise “N/A”)
* 7. Capacity (maximum number of students who can enroll in it)
* 8. Enrollment (number of students actually enrolled in it)
* 9. Instructor’s ID number
* 10. Enrollee list (an ArrayList of student enrollees)
*************************************************************************/
import java.util.*;

public class ClassSection {
	
	//Data members
	private int crnNum;
	private String deptCode;
	private int courseNum;
	private String instructionMode;
	private String meetingDays;
	private String meetingTimes;
	private int capacity;
	private int instructorId;
	private List <StudentEnrollee> studentList = new ArrayList <StudentEnrollee>();
	
	//Constructors
	ClassSection(){ 
		setCrnNum(0);
		setDeptCode("");
		setCourseNum(0);
		setInstructionMode("");
		setMeetingDays("");
		setMeetingTimes("");
		setCapacity(0);
		setInstructorId(0);
		
	}
	
	
	ClassSection(int crnNum, String deptCode, int courseNum, String instructionMode,
			String meetingDays, String meetingTimes, int capacity, int instructorId){
		setCrnNum(crnNum);
		setDeptCode(deptCode);
		setCourseNum(courseNum);
		setInstructionMode(instructionMode);
		setMeetingDays(meetingDays);
		setMeetingTimes(meetingTimes);
		setCapacity(capacity);
		setInstructorId(instructorId);
		
	}
	
	//Setters and getters
	void setCrnNum(int crnNum) {
		this.crnNum = crnNum;
		
	}
	
	
	int getCrnNum() {
		return crnNum;
		
	}
	
	
	void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
		
	}
	
	
	String getDeptCode() {
		return deptCode;
		
	}
	
	
	void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
		
	}
	
	
	int getCourseNum() {
		return courseNum;
		
	}
	
	
	void setInstructionMode(String instructionMode) {
		this.instructionMode = instructionMode;
		
	}
	
	
	String getInstructionMode() {
		return instructionMode;
		
	}
	
	
	void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
		
	}
	
	
	String getMeetingDays() {
		return meetingDays;
		
	}
	
	
	void setMeetingTimes(String meetingTimes) {
		this.meetingTimes = meetingTimes;
		
	}
	
	
	String getMeetingTimes() {
		return meetingTimes;
		
	}
	
	
	void setCapacity(int capacity) {
		this.capacity = capacity;
		
	}
	
	
	int getCapacity() {
		return capacity;
	}
	
	int getEnrollment() {
		return studentList.size();
		
	}
	
	
	void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
		
	}
	
	
	int getInstructorId() {
		return instructorId;
		
	}
	
	//toString method to convert data members of ClassSection object to one string with labels
	public String toString() {
		return ("CRN                  : " + getCrnNum() + "\n" +
				"Department           : " + getDeptCode() + "\n" +
				"Course number        : " +  + getCourseNum() + "\n" +
				"Instructional mode   : " + getInstructionMode() + "\n" +
				"Meeting days         : " + getMeetingDays() + "\n" +
				"Meeting times        : " + getMeetingTimes() + "\n" +
				"Capacity             : " + getCapacity() + "\n" +
				"Enrollment           : " + getEnrollment() + "\n" +
				"Instructor's ID      : " + getInstructorId() + "\n");
	}
	
	//Method to add students
	public void addStudent(int studentId, int grade) {
		StudentEnrollee studentObject = new StudentEnrollee(studentId, grade);
		studentList.add(studentObject);
		
	}
	
	//Method to find if a student ID is within list of objects
	public StudentEnrollee findStudent(int studentIdToFind) {
		for (StudentEnrollee studentObject : studentList) {
			if (studentObject.getStudentId() == studentIdToFind) {
				return studentObject;
			}
		}
		return null;
	}
	
	//Method to withdraw student if student exists
	public void withdrawStudent(int studentId) {
		StudentEnrollee studentObject = findStudent(studentId);
		if (studentObject != null) {
			studentList.remove(studentObject);
		}
	}
	
	//Method to assign grade to student if student exists
	public void assignGrade(int studentId, int grade) {
		StudentEnrollee studentObject = findStudent(studentId);
		
		if (studentObject != null) {
			studentObject.setGrade(grade);
		}
	}
	
	//Display method using a for loop to display each student object
	public void displayList() {
		for (StudentEnrollee studentObject : studentList) {
			System.out.println(studentObject.toString());
		}
	}

}
