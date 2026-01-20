package be_study.test;

public class VilageFcstDTO {
//	int id;  DTO 테이블 PK id
	String baseDate;
	String baseTime;
	String category; //자료구분 코드
	String fcstDate;
	String fcstTime;
	String fcstValue; // 예보 값
	int nx;
	int ny;
	
//	CREATE TABLE Vilage_Fcst (
//		    id NUMBER PRIMARY KEY,
//		    base_Date VARCHAR2(8),
//			base_Time VARCHAR2(6),
//			category VARCHAR2(3),
//			fcst_Date VARCHAR2(8),
//			fcst_Time VARCHAR2(4),
//			fcst_Value VARCHAR2(12),
//			nx NUMBER(5),
//			ny NUMBER(5)
//		);
//		
//		CREATE SEQUENCE SEQ_Vilage_Fcst_PK
//		START WITH 1
//		INCREMENT BY 1
//		NOCYCLE;
	
	public String getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}
	public String getBaseTime() {
		return baseTime;
	}
	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFcstDate() {
		return fcstDate;
	}
	public void setFcstDate(String fcstDate) {
		this.fcstDate = fcstDate;
	}
	public String getFcstTime() {
		return fcstTime;
	}
	public void setFcstTime(String fcstTime) {
		this.fcstTime = fcstTime;
	}
	public String getFcstValue() {
		return fcstValue;
	}
	public void setFcstValue(String fcstValue) {
		this.fcstValue = fcstValue;
	}
	public int getNx() {
		return nx;
	}
	public void setNx(int nx) {
		this.nx = nx;
	}
	public int getNy() {
		return ny;
	}
	public void setNy(int ny) {
		this.ny = ny;
	}
	
	@Override
	public String toString() {
		return "VilageFcstDTO [baseDate=" + baseDate + ", baseTime=" + baseTime + ", category=" + category
				+ ", fcstDate=" + fcstDate + ", fcstTime=" + fcstTime + ", fcstValue=" + fcstValue + ", nx=" + nx
				+ ", ny=" + ny + "]";
	}
	
	
}
