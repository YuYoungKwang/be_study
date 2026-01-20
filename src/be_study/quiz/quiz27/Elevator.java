package be_study.quiz.quiz27;

public class Elevator {  //Elevator.main(args)
	
	public static void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
	}

	public static String guide(int floor) {
		/* 메소드를 완성하시오. */
		//1~10층 : 저층
		//11~20층 : 고층
		
		// 11<=
		// <11
		if(floor >= 11) {
			return "고층";
		} else {
			return "저층";
		}
		
//		if(floor >= 11) {
//			return "고층";
//		}
//		return "저층";
		
	}
}