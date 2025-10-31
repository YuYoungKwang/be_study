package be_study.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
			1.
				x=2 y=3
				5
				5
				x=3 y=4
				x=4 y=5
				x=8 y=4 z=8
				x=10 y=5 z=2
				x=20 y=6 z=2
				x=10 y=6 z=2
				
			2.
				true
				false
				false
				
			3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

			점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
			6000원 이하 -> "훌륭"
			6000원 초과 ~ 8000원 -> "선방"
			8000원 초과 ~ 12000원 -> "눈물"
			12000원 초과 -> "물로배채우기"
			
			int menuPrice = 30000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
			String result = ________;
			System.out.println(result);
			
		 */
		System.out.println("점심값을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int menuPrice = scanner.nextInt(); //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result =  menuPrice <= 6000 ? "훌륭" : (menuPrice <= 8000 ? "선방": (menuPrice <= 12000 ? "눈물" : "물로배채우기"));
		System.out.println(result);
	}

}
