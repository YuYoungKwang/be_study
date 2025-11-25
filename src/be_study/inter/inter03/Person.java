package be_study.inter.inter03;

public class Person {

	//난 사람
	
	//나 휴대폰 하나 가지고 있음
	
	//상속이었으면...   부모클래스 Phone 
	//Phone phone;
	
//	IPhone iPhone;
//	LGPhone lgPhone;
//	GalaxyPhone galaxyPhone;
	
	Callable callPhone; //
//	Callable c1 = new IPhone();
//	Callable c2 = new GalaxyPhone();
//	Callable c3 = new LGPhone();
	
	//사람 입장에서 가지고 있는 핸드폰으로 전화를 건다 -> 기능
	public void call(String targetPhoneNumber) { 
		callPhone.call();
	}
}
