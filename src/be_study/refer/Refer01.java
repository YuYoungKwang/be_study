package be_study.refer;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {
		
		int n;		//값X  기본타입변수
		int num = 0;//값0
		
		String s1;  //값X  참조변수
		String s2 = null; // 참조하는게 없다! null
		
		//System.out.println(n);
		//System.out.println(s1);  //초기화가 안됨
		
		System.out.println(num);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		
		String t1 = "사과";
		String t2 = "사과";
		String t3 = scanner.nextLine(); //문자열 입력 받기
		String t4 = new String("사과");
		
		System.out.println(t1 == t2);		//주소비교 
		System.out.println(t1.equals(t2));	//실제 문자열값 비교
		
		System.out.println(t2 == t3);
		System.out.println(t3.equals(t2));	//실제 문자열값 비교
		
		System.out.println(t2 == t4);
		System.out.println(t4.equals(t2));	//실제 문자열값 비교
	
		System.out.println("-------------------------");
		String ne = null;
		System.out.println( ne == null );
		//System.out.println( ne.equals("사과") );
		// NullPointerException
		
		
		//값 복사
		int n1 = 10;
		int n2 = n1;  //정수형 변수 안에 들어있는 값!!복사!!!
		System.out.println(n1);
		System.out.println(n2);
		
		String ss1 = "배";
		String ss2 = ss1; //참조형 변수 안에 들어있는 주소!!복사!!!
		System.out.println(ss1);
		System.out.println(ss2);
		
	}

}
