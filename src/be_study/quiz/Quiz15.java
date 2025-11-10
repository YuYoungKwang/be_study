package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
	System.out.println("1. 입력");
	System.out.println("2. 수정");
	System.out.println("3. 조회");
	System.out.println("4. 삭제");
	System.out.println("5. 종료");
	System.out.print("메뉴 번호를 입력하세요 : ");
	Scanner scanner = new Scanner(System.in);
	int inputNum = scanner.nextInt();
	while (inputNum != 5) {
		switch (inputNum) {
		case 1: {
			System.out.println("입력 메뉴입니다.");
			System.out.print("메뉴 번호를 입력하세요 : ");
			inputNum = scanner.nextInt();
			break;
		}
		case 2: {
			System.out.println("수정 메뉴입니다.");
			System.out.print("메뉴 번호를 입력하세요 : ");
			inputNum = scanner.nextInt();
			break;
		}
		case 3: {
			System.out.println("조회 메뉴입니다.");
			System.out.print("메뉴 번호를 입력하세요 : ");
			inputNum = scanner.nextInt();
			break;
		}
		case 4: {
			System.out.println("삭제 메뉴입니다.");
			System.out.print("메뉴 번호를 입력하세요 : ");
			inputNum = scanner.nextInt();
			break;
		}
		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("메뉴 번호를 입력하세요 : ");
			inputNum = scanner.nextInt();
			break;
		}
		
	}
	System.out.println("프로그램이 종료됩니다.");
		
	} 

}
