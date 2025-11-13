package be_study.cls.cls02;

public class Car {
	//자동차 의미하는 설계도(클래스)
	
	
	//필드 (속성 변수)
	String model; //모델명 기본값 null
	String color; //차량색상 기본값 null
	int price; //차 가격   기본값 0 
 	
	//생성자 (생성할때 초기화할일 new 클래스명())
	
	//생성자 만든적 없음. -> 자동으로 추가되는 기본생성자
	Car(){ 
		//기본생성자
		// 객체 생성하면서 초기에 해야할 일 (필드의 초기화 (필드변수에 값 세팅))
		System.out.println("Car() 기본생성자 호출됨");
		color = "green";
		model = null;  //필드들의 초기화 수행
		price = 0;
	}
	
	Car(String _model){   // new Car("그랜져");
		System.out.println("Car(String _model) 생성자 호출됨");
		model = _model;  
		//이 생성자를 통해서 객체가 만들어지는 과정에
		//model 필드변수에 매개변수 _model에 전달된 값을 저장하겠다
	}
	
	//매개변수가 2개   
	Car(String model, String color){ // new Car("쏘렌토", "black");
		System.out.println("Car(String model, String color) 생성자 호출됨");
		this.model = model;
		this.color = color;
	}
	
	
	//메소드 (기능 동작)
	
}








