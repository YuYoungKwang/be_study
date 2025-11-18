package be_study.cls.cls08;

public class Singleton {
	
	//Singleton singleton;
	
	//private static Singleton singleton = new Singleton();
	private static Singleton singleton;
	
	//외부에서 생성하지 못하도록
	private Singleton(){  //외부에서 접근 불가
		//singleton = new Singleton();
	}
	
	//메소드
	//singleton = new Singleton();
	//singleton = new Singleton();
	
	static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
	}
	
}
