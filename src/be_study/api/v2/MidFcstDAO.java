package be_study.api.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MidFcstDAO {

//	CREATE TABLE MID_TA
//	(
//	    --no
//	    tm_fc VARCHAR2(16),
//	    reg_id VARCHAR2(8),
//	    ta_min4 NUMBER,
//	    ta_max4 NUMBER,
//	    ta_min5 NUMBER,
//	    ta_max5 NUMBER,
//	    CONSTRAINT MID_TA_PK PRIMARY KEY (tm_fc, reg_id)
//	);
	
//	CREATE TABLE MID_TA_REG_ID
//	(
//	    reg_id VARCHAR2(8),
//	    reg_name VARCHAR2(32)
//	);
	public int saveMidTa(MidTaDTO midTaDTO) {
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO MID_TA VALUES ( ?, ?, ?, ?, ?, ? ) ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅
			psmt.setString(1, midTaDTO.getTmFc());
			psmt.setString(2, midTaDTO.getRegId());
			psmt.setInt(3, midTaDTO.getTaMin4());
			psmt.setInt(4, midTaDTO.getTaMax4());
			psmt.setInt(5, midTaDTO.getTaMin5());
			psmt.setInt(6, midTaDTO.getTaMax5());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
