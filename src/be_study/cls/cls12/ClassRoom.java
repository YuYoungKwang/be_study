package be_study.cls.cls12;

import java.util.ArrayList;

public class ClassRoom {
	
	//필드
	int floor; //몇층
	int roomNumber; //몇호실이냐 몇번교실
	double area; // 30평  85.7m2
	boolean hasWhiteBoard; //화이트보드 존재 여부
	
	//String whiteboard; //문자열로 엄청큰 자석 화이트보드 있음
	WhiteBoard whiteBoard;
	
	AirCon airCon;
	
	//Desk[] deskArr;
	ArrayList<Desk> deskList;
	
//	Desk desk;
//	Desk desk2;
//	Desk desk3;
//	Desk desk4;
	
	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
		whiteBoard = null;
		airCon = null;
		deskList = null;
		//this.deskList = new ArrayList<Desk>();
	}
	
	public ClassRoom(int floor, int roomNumber) {
		this.floor = floor;
		this.roomNumber = roomNumber;
		//this.deskList = new ArrayList<Desk>();
	}
	
	public ClassRoom(WhiteBoard whiteBoard, AirCon airCon) {
		this.whiteBoard = whiteBoard;
		this.airCon = airCon;
		//this.deskList = new ArrayList<Desk>();
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	
	//책상 한개를 넘기면 이 교실의 deskList에 추가 해주는 기능
	public void addDesk(Desk desk) {
		
		if(deskList == null) {
			deskList = new ArrayList<Desk>();
		}
		
		deskList.add(desk);
	}
	
}













