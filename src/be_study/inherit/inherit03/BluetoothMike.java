package be_study.inherit.inherit03;

public class BluetoothMike extends Mike {
	//블루투스 마이크는 마이크다
	
	boolean isConnected; //연결여부
	int battery; //배터리 잔량
	
	public void connect() {
		//블루투스 연결
	}
	
	//메소드 재정의 (오버라이딩)
	
	//private void volumeUp() {
	// 접근제한자의 범위를 더 줄이면서 재정의할수 없다.
	
	public void volumeUp() {
		System.out.println("BluetoothMike 재정의 volumeUp()");
	}
	
	//오버로딩
	public void volumeUp(int v) {
		System.out.println(v+ "만큼 볼륨 업!");
	}
	
	
	//부모에서 final은 재정의 불가
//	public void noMethod() {
//		
//	}
}
