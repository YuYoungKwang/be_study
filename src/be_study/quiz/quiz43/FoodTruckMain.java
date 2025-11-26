package be_study.quiz.quiz43;

import java.util.Scanner;

public class FoodTruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food food = new Food();
		FoodTruck foodTruck = new FoodTruck();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("=====푸드 트럭=====");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문 하기");
			System.out.println("3. 재고 관리");
			System.out.println("4. 마감 하기");
			System.out.print("번호를 입력해주세요. : ");
			int foodTruckChoice = scanner.nextInt();
			if(foodTruckChoice == 1) {
				foodTruck.viewMenu();
			}else if(foodTruckChoice == 2) {
				foodTruck.viewMenu();
				System.out.print("메뉴를 선택해주세요. : ");
				int menuChoice = scanner.nextInt();
				System.out.print("주문 갯수를 입력해주세요. : ");
				int menuCount = scanner.nextInt();
				foodTruck.order(menuChoice, menuCount);
			}else if(foodTruckChoice == 3) {
				System.out.print("메뉴명을 입력해주세요. : ");
				String menuName = scanner.next();
				foodTruck.menuSreach(menuName);
			}else if(foodTruckChoice == 4) {
				foodTruck.closeFoodTruck();
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}
	}

}
