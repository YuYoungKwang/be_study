package be_study.cls.cls05;

import java.util.Scanner;

public class GalaxyMain {

	public static void main(String[] args) {
		
		System.out.println("정적:" + Galaxy.madeBy);
		//System.out.println("인스턴스:" + Galaxy.owner);
		Galaxy.showMadeBy();
		
		Galaxy g1 = new Galaxy(); //인스턴스 객체 생성 
		g1.owner = "엄마";
		g1.model = "갤럭시10";
		System.out.println(g1.madeBy);  //Galaxy.madeBy
		g1.showInfo();
		g1.showMadeBy();
		
		Galaxy g2 = new Galaxy(); //인스턴스 객체 생성 
		g2.owner = "아빠";
		g2.model = "갤럭시24";
		System.out.println(g2.madeBy);
		g2.showInfo();
		g2.showMadeBy();
		
		
		Galaxy.showMadeBy();
		
		System.out.println(Math.random()); // new Math();
		//Integer.parseInt(null);  //new Integer();
		
		Scanner scanner = new Scanner(System.in);
		//scanner.nextInt();
		
		System.out.println(3*3* 3.14);
		System.out.println(3*3* Math.PI);
		
	}

}
