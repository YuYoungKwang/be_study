package be_study.quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		p1.name = "내이름";
		p1.gender = "남";
		p1.age = 24;
		p1.height = 190;
		p1.weight = 101.9;
		p1.job = "건물주";
		p1.bloodType = "A";
		p1.healthState = "매우좋음";
		p1.isSleeping = false;
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.height);
		System.out.println(p1.job);
		System.out.println(p1.isSleeping);
		
		Person p2 = new Person("너이름", 32, 166, true);
		
		System.out.println("----------------------------");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(p2.isSleeping);
	}

}
