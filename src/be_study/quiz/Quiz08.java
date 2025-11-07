package be_study.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		//출생년도와 주민등록번호 뒷자리 첫번째 숫자를 입력받아서, 나이와 성별을 출력하세요.
		//기준은 2025년으로 함.
		//나이는 단순하게 2025년과의 차이로 함 (만 나이, 월 따지지 않음)
		//2000년생 = 26살
		//1996년생 = 30살

		//2000년생 이후로는 뒷자리 남자 : 3, 여자 : 4
		//2000년생 이전은 뒷자리 남자 : 1, 여자 : 2
		//그 외에 케이스가 들어오면 잘못된 입력이라고 출력하도록 처리.
		//어떤 경우가 잘못된 경우일지 한번 생각해보세요~

		//주민번호 뒷자리 첫번째 수 구분.
		//남자 : 1 이거나 3
		//여자 : 2 이거나 4

		//예시 1)
		//출생년도를 입력하세요 : 2000
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 4
		//결과 : 26살 여자입니다.

		//예시 2)
		//출생년도를 입력하세요 : 1998
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 1
		//결과 : 28살 남자입니다.
	
		
		// 2005  1 
		// 1999  4
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		//개별 조건
		if( year < 2000 ) {  // ~1999
			//2000년생 = 26살
			//1996년생 = 30살
			// 2025 - 2000 = 25 + 1 = 26
			// 2025 - 1996 = 29 + 1 = 30
			// 올해기준 - 태어난년도 + 1 -> 옛날에 계산하던 한국식 나이
			
			// 1 남자 2 여자   3X 4X
			if(num == 1) {
				System.out.println("결과 : "+ (2025 - year + 1)  +" 살 남자입니다.");
			} else if (num == 2) {
				System.out.println("결과 : "+ (2025 - year + 1)  +"살 여자입니다.");
			} else {
				System.out.println("잘못된 입력");
			}
		}
		
		if( year >= 2000 ) {
			if(num == 3) {
				System.out.println("결과 : "+ (2025 - year + 1)  +" 살 남자입니다.");
			} else if (num == 4) {
				System.out.println("결과 : "+ (2025 - year + 1)  +"살 여자입니다.");
			} else {
				System.out.println("잘못된 입력");
			}
		}
		
		
		// 개별 조건 상세히
		
		int age = 2025 - year + 1;
		if(year < 2000 && num == 1) {
			//System.out.println("결과 : "+ (2025 - year + 1)  +" 살 남자입니다.");
			System.out.println("결과 : "+ age  +" 살 남자입니다.");
		} else if (year < 2000 && num == 2) {
			System.out.println("결과 : "+ age  +"살 여자입니다.");
		} else if (year >=2000 && num == 3) {
			System.out.println("결과 : "+ age  +" 살 남자입니다.");
		} else if (year >=2000 && num == 4) {
			//System.out.println("결과 : "+ (2025 - year + 1)  +"살 여자입니다.");
			System.out.println("결과 : "+ age  +"살 여자입니다.");
		} else {
			System.out.println("잘못된 입력");
		}
		
		
		//정상 범위를 먼저 체크
		
		// 2000년 미만 1 | 2
		// 2000년 이상 3 | 4
		
		// && || 
		
//		if(  (year < 2000 && num == 1) || (year < 2000 && num == 2)
//				|| (year >= 2000 && num == 3) || (year >= 2000 && num == 4)) {
		if ( 	(	year <2000 && (num == 1 || num == 2)	)
				||
				(	year >=2000 && (num == 3 || num == 4)	)
			) {

			//정상범위
			age = 2025 - year + 1; //나이 계산
			
			if(num == 1 || num == 3) {
				System.out.println("결과 : "+ age  +" 살 남자입니다.");
			} else {
				System.out.println("결과 : "+ age  +"살 여자입니다.");
			}
			
//			if(num == 1) {
//				System.out.println("결과 : "+ age  +" 살 남자입니다.");
//			} else if (num ==2) {
//				System.out.println("결과 : "+ age  +"살 여자입니다.");
//			}else if (num == 3) {
//				System.out.println("결과 : "+ age  +" 살 남자입니다.");
//			} else {
//				System.out.println("결과 : "+ age  +"살 여자입니다.");
//			}
			
		} else {
			System.out.println("잘못된 입력");
		}
	}

}














