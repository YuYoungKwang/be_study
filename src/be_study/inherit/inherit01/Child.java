package be_study.inherit.inherit01;

public class Child extends Parent {
	String schoolName; //학교이름
	int grade;  //학년
	
	public Child() {
		//super();//부모생성자 호출
		super(0);
		System.out.println("Child 생성자 실행됨");
	}
	
	public Child(String schoolName, int grade) {
		super(0);//부모생성자 호출 먼저
		//자식객체 생성자에서 할일들.. 나머지 코드
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	public Child(String schoolName, int grade, int money) {
		super(money);//부모생성자 호출 먼저
		//자식객체 생성자에서 할일들.. 나머지 코드
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	
	public void play() {
		System.out.println("나가서 뛰어 놀고 있습니다.");
	}
	
	public void printInfo() {
		System.out.println(schoolName + " " + grade + " " + money);
		System.out.println(age); //Child -> Parent -> GrandParent
	}
	
	
}










