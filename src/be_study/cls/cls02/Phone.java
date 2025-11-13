package be_study.cls.cls02;

public class Phone {

	//필드
	String model; //모델명
	int price;  //가격
	int battery; //배터리용량 3100  4000
	
	//생성자
	
	//기본생성자 Phone(){}
	//Phone(){}
	
	
	//Phone p1 = new Phone("아이폰12");
	Phone(String model){  //매개변수 1개 String
		this(model, 0, 2500);
//		this.model = model;
//		this.price = 0;
//		this.battery = 2500;
		
		//재부팅
		//필름부착
		//알콜 소독
		//...
		//불량검사
	}
	
	//모델명, 가격
	Phone(String model, int price) { // String int
//		this.model = model;
//		this.price = price;
//		this.battery = 2500;
		this(model, price, 2500);
		
		//재부팅
		//필름부착
		//알콜 소독
		//...
		//불량검사
	}
	
	// new Phone("갤럭시S10", 900000);
	// new Phone(4000, "아이폰6");
	
	//Phone(String model, int battery) { // String int 중복으로 불가
	Phone(int battery, String model) { // int String
//		this.model = model;
//		this.battery = battery;
//		this.price = 0;
		this(model, 0, battery);
		
		//재부팅
		//필름부착
		//알콜 소독
		//...
		//불량검사
	}
	
	Phone(String model, int price, int battery) { 
		this.model = model;
		this.price = price;
		this.battery = battery;
		
		//재부팅
		//필름부착
		//알콜 소독
		//...
		//불량검사
		//기능검사
	}
	
	Phone(int battery, String model, int price) { 
		this.model = model;
		this.price = price;
		this.battery = battery;
		//재부팅
		//필름부착
		//알콜 소독
		//...
		//불량검사
	}
	
	//메소드
}
