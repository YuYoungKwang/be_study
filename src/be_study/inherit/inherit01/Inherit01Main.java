package be_study.inherit.inherit01;

public class Inherit01Main {

	public static void main(String[] args) {
		//Parent p1 = new Parent();
		Parent p1 = new Parent(5000);
		p1.money = 5000;
		p1.say();
		
		Child c1 = new Child();
		c1.schoolName = "중앙초등학교";
		c1.grade = 3;
		c1.money = 1000;
		c1.play();
		c1.say();
		
		Child c2 = new Child("서초등", 5, 1000);
		c2.say();
		c2.play();
		System.out.println(c2.grade);
		System.out.println(c2.schoolName);
		System.out.println(c2.money);
		
		c2.age = 12;
		c2.printInfo(); //가지고 있는 정보 출력
	}

}
