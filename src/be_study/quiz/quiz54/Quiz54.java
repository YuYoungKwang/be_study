package be_study.quiz.quiz54;

import java.util.List;

public class Quiz54 {

	public static void main(String[] args) {
		
		StudentScoreDAO sDAO = new StudentScoreDAO();
		
		//List<StudentScoreDTO> list = sDAO.findStudentScoreListByDeptno(101);
		List<StudentScoreDTO> list = sDAO.findStudentScoreListByDeptno(103);
		
		for(StudentScoreDTO s : list) {
			System.out.println(s);
		}
	}

}
