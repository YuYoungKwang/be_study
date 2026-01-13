package be_study.exp;

import java.util.Scanner;

public class Exp01 {

	public static void main(String[] args) {
		// 예외처리
		TempCls tc = null;
		
		if(tc != null) {
			tc.t = 10;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력하세요~");

		/*
		try { //예외가 발생할 수 있는 코드 작성 영역
			int input = scanner.nextInt();
			System.out.println(input);
		} catch (Exception e) { //예외 발생시 실행될 코드 영역
			System.out.println("숫자로만 입력해주세요~");
		}
		*/
		
		String s = scanner.nextLine();
		
		try {
			//s가 숫자형이 아니면 예외 발생
			int n = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println("숫자로만 입력해주세요~");
		}
		
		//정상진행~
		
		int n = 0;
		try {
			System.out.println("parseInt 실행 전");
			n = Integer.parseInt(s);
			System.out.println("parseInt 실행 후");
		} catch (Exception e) {
			System.out.println( e.getMessage() );
			e.printStackTrace();
		} finally {
			System.out.println("여기는 finally 마지막에 꼭 실행");
		}
		
		try {
			//Class.forName("java.lang.String");
			Class.forName("java.lang.String222");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class TempCls {
	int t;
}