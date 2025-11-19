package be_study.quiz.quiz30;

public class Student {
	
	private String department;
	private String studentID;
	
	
	
	private String getDepartment() {
		return department;
	}



	private void setDepartment(String department) {
		this.department = department;
	}



	private String getStudentID() {
		return studentID;
	}



	private void setStudentID(String studentID) {
		this.studentID = studentID;
	}



	public static void main(String[] args) {
		Student student = new Student();
		
//		student.department = "전자공학과";
//		student.studentID = "18100046";
//		
//		System.out.println("학과 : " + student.department);
//		System.out.println("학번 : " + student.studentID);
		
		student.setDepartment("전자공학과");
		student.setStudentID("18100046");
		
		System.out.println("학과 : " + student.getDepartment());
		System.out.println("학과 : " + student.getStudentID());
	}
	
}