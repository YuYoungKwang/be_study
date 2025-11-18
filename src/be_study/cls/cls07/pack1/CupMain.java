package be_study.cls.cls07.pack1;

// import java.util.Scanner; //다른 패키지 경로에 있는 클래스를 사용하기위해 import 

import be_study.cls.cls07.pack2.Cup;

public class CupMain {

	public static void main(String[] args) {
		
		Cup c1 = new Cup();
		be_study.cls.cls07.pack1.Cup c2 = new be_study.cls.cls07.pack1.Cup();
		be_study.cls.cls07.pack1.Cup c3 = new be_study.cls.cls07.pack1.Cup();
		be_study.cls.cls07.pack1.Cup c4 = new be_study.cls.cls07.pack1.Cup();
		c4.type = "유리";
		c4.method();
		
		//클래스 명의 풀네임은 패키지 포함
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		Cup c5 = new Cup();
		
		be_study.cls.cls07.pack2.Cup c6 = new be_study.cls.cls07.pack2.Cup();
		
		c5.method();
		c6.method();
		
		c6.type = "플라스틱";
	}

}
