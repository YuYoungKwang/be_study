package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] menuLis = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] menuCost = {3500, 4100, 4300};
		int menuSelect = 0;
		int menuCount = 0;
		String order = "";
		int totalCost = 0;
		int americano = 0;
		int cafeLatte = 0;
		int VLatte = 0;
		do {			
			System.out.println("======== 메뉴 ========");
			for(int i = 0; i < menuLis.length; i++) {
				System.out.printf("%d. %-10s %d \n", i+1, menuLis[i], menuCost[i]);
			}
			
			System.out.println("=====================");
			System.out.print("메뉴 선택 : ");
			menuSelect = scanner.nextInt();
			while (0 >= menuSelect || menuSelect >= 4) {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				System.out.println("======== 메뉴 ========");
				for(int i = 0; i < menuLis.length; i++) {
					System.out.printf("%d. %-10s %d \n", i+1, menuLis[i], menuCost[i]);
				}
				
				System.out.println("=====================");
				System.out.print("메뉴 선택 : ");
				menuSelect = scanner.nextInt();
			}
			System.out.print("수량 선택: ");
			menuCount = scanner.nextInt();
			if(menuSelect == 1) {
				americano += menuCount;
			}else if(menuSelect == 2) {
				cafeLatte += menuCount;
			}else if(menuSelect == 3) {
				VLatte += menuCount;
			}
			System.out.print("추가주문하시겠습니까?(y/n): ");
			order = scanner.next();
			while (!"n".equals(order) && !"y".equals(order)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.print("추가주문하시겠습니까?(y/n): ");
				order = scanner.next();
			}
		} while (!"n".equals(order));
		System.out.println("=====================");
		
		if(americano > 0) {
			System.out.println("아메리카노 " + americano + "잔 :" + 3500*americano);
			totalCost += 3500*americano;
		}
		if(cafeLatte > 0) {
			System.out.println("카페라떼 " + cafeLatte + "잔 :" + 4100*cafeLatte);
			totalCost += 4100*cafeLatte;
		}
		if(VLatte > 0) {
			System.out.println("바닐라라떼 " + VLatte + "잔 :" + 4300*VLatte);
			totalCost += 4300*VLatte;
		}
		
		System.out.println("=====================");
		System.out.println("총액 : " + totalCost);
		
	} 
}
