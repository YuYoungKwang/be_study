package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v1.Dept;

public class Quiz45 {

	public static void main(String[] args) {

		/*
		 * 단순 select 해서 데이터 읽어오기 대상 테이블 : product
		 * 
		 * 1. 단일 행을 읽어서 리턴해서 출력하기
		 * 
		 * 2. 객체 리스트 단위로 리턴해서 출력하기
		 */
		
		Product p1 = findProductByPCode(102);
		if(p1 != null) {
			System.out.println(p1.toString());
		}
		
		System.out.println("---------------------------");
		
		List<Product> list = findProductList();
		if(list != null && list.size() > 0) {
			
			for(Product p : list) {
				System.out.println(p.toString());
			}
			
		}
	}

	//
//	1. 단일 행을 읽어서 리턴해서 출력하기
	public static Product findProductByPCode(int pCode) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Product product = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from product where p_code = ? ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, pCode);

			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다
				product = new Product();

				product.setpCode( rs.getInt("p_code"));
				product.setpName( rs.getString("p_name"));
				product.setpPrice( rs.getInt("p_price"));
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return product;
	}
	
	

	public static List<Product> findProductList() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Product> productList = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from product ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				Product product = new Product();

				product.setpCode( rs.getInt("p_code"));
				product.setpName( rs.getString("p_name"));
				product.setpPrice( rs.getInt("p_price"));

				if (productList == null) {
					productList = new ArrayList<Product>();
				}
				productList.add(product); // 최종 return 할 dept목록 list에 추가
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productList;
	}

}
