
public class StudentEnrollee {
	
	//Properties
	private int studentId;
	private int grade;
	
	//Constructors
	StudentEnrollee(){
		studentId = 0;
		grade = 0;
		
	}
	
	StudentEnrollee(int studentId, int grade){
		this.studentId = studentId;
		this.grade = grade;
		
	}
	
	//Getters and setters
	public int getStudentId() {
		return studentId;
	}

	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	public int getGrade() {
		return grade;
	}

	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	//To string method
	public String toString() {
		return "Student ID: " + getStudentId() + "\n" +
				"Student Grade: " + getGrade() + "\n";
	}

}
