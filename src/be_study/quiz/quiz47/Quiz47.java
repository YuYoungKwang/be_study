package be_study.quiz.quiz47;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz47 {

	public static void main(String[] args) {
		
		Product p1 = findProductByPCode(104);
		System.out.println(p1.getP_code() + " " + p1.getP_name() + " " + p1.getP_price());
		
		List<Product> productList2 = findProductList();
		
		if( productList2.size() == 0) {
		}
		
		if( productList2 != null && productList2.size() > 0 ) {
			
			
			for(Product p : productList2) {
				System.out.println(p.toString());
			}
		}
	}
	
	public static Product findProductByPCode(int p_code) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; 
		PreparedStatement psmt = null;  
		ResultSet rs = null; 
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Product product = null;
		
		
		String sqlQuery = " select * from Product where p_code = ? ";
		
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			
			psmt.setInt(1, p_code);
			
			rs = psmt.executeQuery();
			
			
			if(rs.next()) {  
				
				product = new Product();
				
				product.setP_code( rs.getInt("p_code") );
				product.setP_name( rs.getString("p_name") );
				product.setP_price( rs.getInt("p_price"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		try {
			if(rs != null) {
				rs.close();  
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
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
				
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; 
		PreparedStatement psmt = null; 
		ResultSet rs = null; 
		
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<Product> productList = new ArrayList<Product>();
		

		String sqlQuery = " select * from Product ";
		
	
		try {
			
			psmt = conn.prepareStatement(sqlQuery);			
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {  
				Product product = new Product();
				product.setP_code( rs.getInt("p_code") );
				product.setP_name( rs.getString("p_name") );
				product.setP_price( rs.getInt("p_price"));
				
				productList.add(product); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(rs != null) {
				rs.close(); 
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}
}
