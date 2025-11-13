package be_study.cls.cls02;

public class PhoneMain {

	public static void main(String[] args) {

		//Phone p1 = new Phone(); 기본생성자가 없으면 생성불가
		Phone p1 = new Phone("아이폰12");
		Phone p2 = new Phone("갤럭시24");
		
		Phone p3 = new Phone("갤럭시S10", 900000);
		Phone p4 = new Phone(4000, "아이폰6");
		
		Phone p5 = new Phone("갤럭시S25", 1500000, 4100);
		
		
	}

}
