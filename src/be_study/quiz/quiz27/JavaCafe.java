package be_study.quiz.quiz27;

public class JavaCafe {
	public static void main(String[] args) {
		printPay(10.00, 40); //10달러 40시간
		printPay(10.00, 50); //10달러 50시간
		printPay(7.50, 38);  //7.5달러 38시간   최저시급 8$ 이하!!!
		printPay(8.50, 66);  //8.5달러 66시간   60시간 초과!!!
		
//		printPay(17, 59);
//		printPay(3, 40);
//		printPay(300, 100);
	}

	// 시급과 일한 시간을 입력받아, 주급을 출력
	public static void printPay(double basePay, int hours) {
		
		// basePay 기본시급이 8 미만
		// hours 근무시간 60 초과
		
		//정상 ~
		//else ~
		
		//잘못된 경우 먼저 필터링
		if(basePay < 8) {
			System.out.println("최저 시급 에러!");
			return; //메소드 종료
		}
		
		if(hours > 60) {
			System.out.println("초과 근무시간 에러!");
			return; //메소드 종료
		}
		
		// 앞에서 필터링 return 
		
		//정상
		double pay = 0.0;
		/* 해당 메소드를 완성하세요. */
		//50시간?
		// 40 시간 * 기본시급    //XXX50*기본시급1.5XXX
		// 초과 10시간 * 기본시급1.5
		
		// 40시간까지~   시급 * 시간
		// 40시간 초과?  ~60시간  초과한시간 * basePay * 1.5
		
		if(hours <= 40) {
			pay = basePay * hours;
		} else { // 시간 > 40  41~60
			pay = (basePay * 40) + ((hours - 40) * basePay * 1.5 );
		}
		
		System.out.printf("$ %.2f\n", pay);
	}
}