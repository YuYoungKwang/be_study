package be_study.quiz.quiz24;

public class Person {
	
//	사람 클래스

	//필드변수
	
	String name;  //이름
	String gender;//성별  "남" "여" "male" "female" "man" "girl"  
	//int gender;// 1 남 2 여
	int age; 		  //	나이   22
	double height; 	  //    키  167.7
	double weight; 	  //	몸무게     65.5
	String job; 	  //	직업
	String bloodType; //"A" "A-" "B"  "B-" "Rh-B" "AB" "O"	혈액형  1 2 3 4 
	String healthState; //	건강상태    "매우좋음" "좋음" "보통" "나쁜편" "죽기직전"
						//int    10~  5~  1	
						//boolean 건강하다여부 true false
	boolean isSleeping; //boolean	수면중여부  true 잔다  false 안잔다
	
	
	Person(){
	}
	
	Person(String name, int age, double height, boolean isSleeping){
		this.name = name;
		this.age = age;
		this.height = height;
		this.isSleeping = isSleeping;
	}
}
