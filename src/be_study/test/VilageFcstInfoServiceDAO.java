package be_study.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class VilageFcstInfoServiceDAO {


	public int saveVilageFcstList(List<VilageFcstDTO> vilageFcstList) {
		//DB에 저장..
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		
		int result = 0;
		
		// 실행 쿼리 준비
				String sqlQuery = " INSERT INTO Vilage_Fcst VALUES( SEQ_Vilage_Fcst_PK.nextval, ?, ?, ?, ?, ?, ?, ?, ?) ";
		

		// 쿼리 실행 후 후속 데이터 처리
		try {
				psmt = conn.prepareStatement(sqlQuery);
			for(VilageFcstDTO vilageFcstDTO : vilageFcstList) {
				

				// 파라미터 세팅
				psmt.setString(1, vilageFcstDTO.getBaseDate());
				psmt.setString(2, vilageFcstDTO.getBaseTime());
				psmt.setString(3, vilageFcstDTO.getCategory());
				psmt.setString(4, vilageFcstDTO.getFcstDate());
				psmt.setString(5, vilageFcstDTO.getFcstTime());
				psmt.setString(6, vilageFcstDTO.getFcstValue());
				psmt.setInt(7, vilageFcstDTO.getNx());
				psmt.setInt(8, vilageFcstDTO.getNy());

				result += psmt.executeUpdate(); //INSERT 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
