package be_study.cls.cls13;

public class AttendTool {
	//출근 체크하는 기구
	boolean isPowerOn;
	//String organization; //어떤 조직/회사를 위한 도구
	String org; //어떤 조직/회사를 위한 도구
	
	
	//출근체크 
	// 체크 결과 return   -> 처리성공 true  처리실패 false
	public boolean checkAttend(Card card) { //출근체크
		
		// card.owner 카드소유주 -> 로직 성공 실패
		
		// 처리성공
		return true;
		
		// 처리 실패 
		// return false; 
	}
	
	// 결과 return int값 -> 1:출근성공 2:실패 3:퇴근성공 4:조퇴성공 5:지각인식
	public int checkAttend2(Card card) { //출근체크
		
		// card.owner 카드소유주 -> 로직 성공 실패
		
		// 처리성공
		return 1;
		
		//if( 처리 실패 
		// return 2;
		
		//if( 퇴근처리 성공 
		//return 3;
	}
	
	//카드하고 카드찍는 학생 정보를 교차 확인 해서 처리
	public boolean checkAttend(Card card, Student student) {
		
		//로직
		if(student.name == card.owner) {
			return true;
		}
		
		return false;
	}
	
	//학생 정보안에 카드가 있으니, 그 카드로 처리하겠다? -> 이런 방향이면 가능
	//이미 확인했으니, 이 학생을 출근처리하세요~
	public boolean checkAttend(Student student) {
		//student.card.owner
		//student.name
		return true;
	}
	
	//전원을 켜는 기능!
	public void powerOn() {
		this.isPowerOn = true;  //전원이 켜졌다는 상태로 변환
	}
}







