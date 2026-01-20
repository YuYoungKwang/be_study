package be_study.quiz.quiz52;

import java.util.List;

public class Quiz52 {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> list1 = studentDAO.findStudentList();
		
		for(StudentDTO s : list1) {
			System.out.println(s);
		}
		
		List<StudentDTO> list2 = studentDAO.findStudentListByGrade(3);
		
		System.out.println("grade 기준 3학년 데이터******************");
		for(StudentDTO s : list2) {
			System.out.println(s);
		}
	}

}
