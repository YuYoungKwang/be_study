package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		/*
			수행해야하는 순서 (흐름)
			
			조건 -> 처리 방향
			언제까지
			
			
			*** 메뉴 뭐 시켰는지 어디에 저장/관리?
			*** 메뉴 뭐 몇개 시켰지?
			*** 메뉴 금액 얼만지 어디에?
			*** 가지고 있는 메뉴가 뭐뭐가 있지? 
			
			메뉴보여주기.
				-> 메뉴 관리?
				-> 어떻게 보여줄건가?
			
			메뉴 선택 입력 받기.
				-> 단순 입력
				-> 잘못 입력 대처?
			
			주문 수량 몇개 입력 받기.
				-> 단순 입력
				-> 잘못 입력? 
			
			추가주문 여부 체크 (y/n).
				- 추가주문 y -> 다시 메뉴보여주기부터 반복
				- 추가주문 n -> (메뉴수량, 총금액) -> 끝.
				
			주문한 메뉴별 수량 보여주기
			주문 총금액 보여주기.
			
		 */
		
		//for
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		//배열 활용
		/*
		0	1	2
		아메	ㅁ	ㅁ	이름
		35	ㅁ	ㅁ	가격
		10	ㅁ	ㅁ	갯수
		*/
		
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼", "레몬티"}; //메뉴이름
		int[] priceArr = {3500, 4100, 4300, 3800}; //메뉴가격
		int[] countArr = new int[menuArr.length]; //메뉴주문수량
		
		int menu;  //메뉴선택
		int count; //수량선택
		String addOrder;  //추가주문여부
		
		while(true) {
			
			while(true) {
				//메뉴보여주기
				System.out.println("=======메뉴======");
				for(int i=0; i<menuArr.length; i++) {  //인덱스 0 1 2   3개
					System.out.printf("%d.%-8s%7d원\n", i+1, menuArr[i], priceArr[i]);
				}
				System.out.println("================");
				
				//메뉴선택
				System.out.print("메뉴 선택 : ");
				menu = scanner.nextInt();
				
				if(menu >= 1 && menu <= menuArr.length) { //정상선택
					break;
				} else {
					System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
				}
			}
			//메뉴 선택 정상적으로 했다. ----------------
			
			
			//메뉴 선택 완료
			//수량 선택
				
			//수량선택
			System.out.print("수량 선택 : ");
			count = scanner.nextInt(); 
			//몇번 메뉴 선택 ? -> menu
			//몇개 시켰지? -> count
			
			countArr[menu-1] += count; //선택한 메뉴번호-1 위치 인덱스에 수량 추가
				
			//추가주문 여부 선택
			scanner.nextLine(); //기존 입력값 (엔터) 청소용
				
			while(true) {
				System.out.print("추가주문 하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine();
				
				if(addOrder.equals("y") || addOrder.equals("n")) {
					break;
				} else {
					System.out.println("잘못입력했습니다. 추가주문여부(y/n) 다시 선택해주세요!!");
				}
			}
				
			if( addOrder.equals("n")) {
				//최종 금액 보여주고 종료
				System.out.println("==========================");
				int total = 0;
				for(int i=0; i<menuArr.length; i++) {
					if(countArr[i] > 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
						total += countArr[i]*priceArr[i];
					}
				}
				
				//총합 금액
				System.out.println("==========================");
				System.out.println("총액 : " +  total + "원");
				
				break;
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		//각각 변수 처리 + 하드코딩 
		int menu1Count = 0;	//아메리카노 주문 갯수
		int menu2Count = 0; //카페라떼 주문 갯수
		int menu3Count = 0; //바닐라라떼 주문 갯수
		
		int menu;  //메뉴선택
		int count; //수량선택
		String addOrder;  //추가주문여부
		
		while(true) {
			
			//메뉴보여주기
			System.out.println("=======메뉴======");
			System.out.println("1.아메리카노    3500원");
			System.out.println("2.카페라떼     4100원");
			System.out.println("3.바닐라라떼    4300원");
			System.out.println("================");
			
			//메뉴선택
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			
			//if(menu == 1 || menu == 2 || menu == 3) { //정상선택
			if(menu >= 1 && menu <= 3) { //정상선택
				
				
				//수량선택
				System.out.print("수량 선택 : ");
				count = scanner.nextInt();
				
				if(menu == 1) {
					menu1Count += count;
				} else if (menu ==2) {
					menu2Count += count;
				} else { //1~3   3
					menu3Count += count;
				}
				
				//추가주문 여부 선택
				scanner.nextLine(); //기존 입력값 (엔터) 청소용
				
				while(true) {
					System.out.print("추가주문 하시겠습니까?(y/n) : ");
					addOrder = scanner.nextLine();
					
					//if(추가주문 여부가 "n" 이다?)
					// 	break; -> 주문내역/금액출력 -> 끝
					
					if(addOrder.equals("y") || addOrder.equals("n")) {
						break;
					} else {
						System.out.println("잘못입력했습니다. 추가주문여부(y/n) 다시 선택해주세요!!");
					}
				}
				
				if( addOrder.equals("n")) {
					//최종 금액 보여주고 종료
					System.out.println("==========================");
					if(menu1Count > 0)
						System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
					
					if(menu2Count > 0)
						System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
					
					if(menu3Count > 0)
						System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300);
					
					//총합 금액
					int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
					System.out.println("==========================");
					System.out.println("총액 : " +  total + "원");
					
					break;
				}
				
//				if(addOrder.equals("y")) {
//					continue;
//				} else if( addOrder.equals("n")) {
//					//더이상 추가주문 안하고 종료
//					
//				} else { //y 나 n이 아니면?
//					//잘못된입력
//				}
				
			} else { //잘못선택
				System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
//				continue;
			}
			
			
		}
		*/
		
		//주문내역/금액출력 끝
		
		
	}

}
