
/*************************************************************************
* Name: HW 7 Classes And Objects Part 2
* File: ClassSectionDriver.java
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

public class ClassSectionDriver {

	public static void main(String[] args) {
		
		//Create ClassSection object
		ClassSection sectionObj1 = new ClassSection(12345, "PHI", 101, "In-person", "MWF", "2:30-4:30", 50, 8693);
		
		//Use objects setter methods to assign values to its attributes
		sectionObj1.setCrnNum(20008);
		sectionObj1.setDeptCode("CIS");
		sectionObj1.setCourseNum(131);
		sectionObj1.setInstructionMode("Online");
		sectionObj1.setMeetingDays("N/A");
		sectionObj1.setMeetingTimes("N/A");
		sectionObj1.setInstructorId(666);
		
		
		//Add students
		sectionObj1.addStudent(1, 0);
		sectionObj1.addStudent(2, 0);
		sectionObj1.addStudent(3, 0);
		sectionObj1.addStudent(4, 0);
		
		//Display list of added students
		System.out.println(sectionObj1.toString());
		System.out.println("Intial student list:");
		sectionObj1.displayList();
		
		//Change grades of students
		sectionObj1.assignGrade(1, 1);
		sectionObj1.assignGrade(2, 2);
		sectionObj1.assignGrade(3, 3);
		sectionObj1.assignGrade(4, 4);
		
		//Display list of students with new grades
		System.out.println(sectionObj1.toString());
		System.out.println("Student list with new grades:");
		sectionObj1.displayList();
		
		//Withdraw student two
		sectionObj1.withdrawStudent(2);
		
		//Display list a final time with student two removed
		System.out.println(sectionObj1.toString());
		System.out.println("Student list with student two removed:");
		sectionObj1.displayList();
		
	}

}
