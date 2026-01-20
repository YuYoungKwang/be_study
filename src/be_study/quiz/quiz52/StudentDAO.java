package be_study.quiz.quiz52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO {
	
	
/*
	1. 기본 student 전체 조회 메소드
	
	2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
	
	- 리턴은 둘다 모두 List<> 타입으로 반환
	- StudentDTO 객체 생성 필요
	- 출력시 날짜는 1975-10-23 형식으로 출력할 것
*/
	
	public List<StudentDTO> findStudentList() {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		// 실행 쿼리 준비
		String sqlQuery = " select studno, name, id, grade, jumin, "
				+ "        TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
				+ "        tel, height, weight, deptno1, deptno2, profno "
				+ " FROM student ";

		
		
		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				StudentDTO studentDTO = new StudentDTO();
				//LocalDateTime
				//student.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				studentDTO.setStudno(rs.getInt("studno"));
				studentDTO.setName(rs.getString("name"));
				studentDTO.setId(rs.getString("id"));
				studentDTO.setGrade(rs.getInt("grade"));
				studentDTO.setJumin(rs.getString("jumin"));
				studentDTO.setBirthday(rs.getString("birthday"));
				studentDTO.setTel(rs.getString("tel"));
				studentDTO.setHeight(rs.getInt("height"));
				studentDTO.setWeight(rs.getInt("weight"));
				studentDTO.setDeptno1(rs.getInt("deptno1"));
				studentDTO.setDeptno2(rs.getInt("deptno2"));
				studentDTO.setProfno(rs.getInt("profno"));
				
				studentList.add(studentDTO); 
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;
	}
	
	public List<StudentDTO> findStudentListByGrade(int grade) {
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		// 실행 쿼리 준비
		String sqlQuery = " select studno, name, id, grade, jumin, "
				+ "        TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
				+ "        tel, height, weight, deptno1, deptno2, profno "
				+ " FROM student where grade = ? ";

		
		
		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, grade);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				StudentDTO studentDTO = new StudentDTO();
				//LocalDateTime
				//student.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				studentDTO.setStudno(rs.getInt("studno"));
				studentDTO.setName(rs.getString("name"));
				studentDTO.setId(rs.getString("id"));
				studentDTO.setGrade(rs.getInt("grade"));
				studentDTO.setJumin(rs.getString("jumin"));
				studentDTO.setBirthday(rs.getString("birthday"));
				studentDTO.setTel(rs.getString("tel"));
				studentDTO.setHeight(rs.getInt("height"));
				studentDTO.setWeight(rs.getInt("weight"));
				studentDTO.setDeptno1(rs.getInt("deptno1"));
				studentDTO.setDeptno2(rs.getInt("deptno2"));
				studentDTO.setProfno(rs.getInt("profno"));
				
				studentList.add(studentDTO); 
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;
	}
	
	
	public int saveStudent(StudentDTO studentDTO) {
		
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO student " 
				+ " VALUES ( ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?, ? ) " ;
		
		int result = 0;
		
		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, studentDTO.getStudno());
			psmt.setString(2, studentDTO.getName());
			psmt.setString(3, studentDTO.getId());
			psmt.setInt(4, studentDTO.getGrade());
			psmt.setString(5, studentDTO.getJumin());
			
			psmt.setString(6, studentDTO.getBirthday());
			psmt.setString(7, studentDTO.getTel());
			psmt.setInt(8, studentDTO.getHeight());
			psmt.setInt(9, studentDTO.getWeight());
			psmt.setInt(10, studentDTO.getDeptno1());
			
			if(studentDTO.getDeptno2() == null) {
				psmt.setNull(11, Types.INTEGER); //null세팅
			} else {
				psmt.setInt(11, studentDTO.getDeptno2());
			}
			//psmt.setInt(11, studentDTO.getDeptno2());
			
			psmt.setInt(12, studentDTO.getProfno()); //FK 
			
//			psmt.setTimestamp(6,
//					ConvertDateUtil.convertLocalDateTimeToTimestamp( ConvertDateUtil.convertDateStringToLocalDateTime("2000-05-31") ));
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
	
}














