package be_study.quiz.quiz30.q1;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
//		s1.department = "컴공";
//		s1.studentNum = 211;
		s1.setDepartment("컴공");
		s1.setStudentNum(211);
		
//		System.out.println("학과:" + s1.department );
//		System.out.println("학번:" + s1.studentNum );
		System.out.println("학과:" + s1.getDepartment() );
		System.out.println("학번:" + s1.getStudentNum() );
	}

}
