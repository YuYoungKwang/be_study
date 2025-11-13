package be_study.cls.cls01;

public class StudentMain {
	
	//실행 클래스  main을 보유한 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		
		//기본타입
		int n;
		n = 10;
		
		//참조타입변수 (배열)
		//int[] arr;
		//int[] arr = {1,2,3};
		int[] arr = null;
		//arr[0] = 30; error
		arr = new int[5];
		arr[0] = 50;
		
		//클래스 타입 변수  <- 참조타입변수
		//클래스 변수 
		
		//Student stu1;
		Student stu1 = null;
		stu1 = new Student(); //인스턴스 객체 생성
		
		Student stu2 = new Student(); //인스턴스 객체 생성
		
		stu1.name = "이하나";
		stu2.name = "김둘";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		stu1.grade = 3;
		stu2.grade = 5;
		
		System.out.println(stu1.grade);
		System.out.println(stu2.grade);
		
		System.out.printf("%s는 %d학년\n", stu1.name, stu1.grade);
		System.out.printf("%s는 %d학년\n", stu2.name, stu2.grade);
		
		System.out.println(stu1.phone);
		System.out.println(stu2.studentNumber);
		
	}

}



