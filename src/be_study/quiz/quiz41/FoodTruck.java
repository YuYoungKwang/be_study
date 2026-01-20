package be_study.quiz.quiz41;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {
	
	String truckName; //트럭이름
	int totalSales; //총매출액
	boolean isOpened; //영업중 여부	

	//푸드트럭은 판매하는 푸드종류(메뉴) 여러개 가지고 있다
	ArrayList<Food> foodList;
	
	public FoodTruck() {
		truckName = null;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public void addMenu(Food food) {
		foodList.add(food);
	}

	public void addMenu(String name, int price) {
		Food food = new Food(name, price);
		foodList.add(food);
	}
	
	public void startSales() {
		//영업시작 ~ 장사시작~
		isOpened = true;
		System.out.println("=======["+ truckName + " 푸드트럭 영업시작 ]=======");
		
		while(isOpened) {
			
			int menuInput = getMainMenu();
			
			switch(menuInput) {
			case 1: //메뉴보기
				// 인덱스         : 0 1 2 3 ...
				// 사용자 메뉴 번호 : 1 2 3 4 ...
				showFoodList();
				break;
			case 2: //주문하기
				orderMenu();
				break;
			case 3: //재고관리
				manageStock();
				break;
			case 4: //마감하기
				finishSales();
				break;
			}
			
		}
	}
	
	public int getMainMenu() {
		Scanner scanner = new Scanner(System.in);
		int menuInput;
		
		while(true) {
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");
			
			menuInput = scanner.nextInt();
			
			if(menuInput >= 1 && menuInput <= 4) {
				break;
			} else {
				System.out.println(">>> 잘못입력했습니다. ");
				System.out.println(">>> 보기중에 선택하세요 (1~4) ");
			}
		}
		return menuInput;
	}
	
	public void showFoodList() { //메뉴보여주기
		System.out.println();
		System.out.println("-------[메뉴]-------");
		for(int i=0; i<foodList.size(); i++) {
			System.out.printf("[%d] %s\n", i+1, foodList.get(i).getFoodInfo());
		}
	}
	
	public void orderMenu() { //주문하기
		//주문할 메뉴 입력받기
		
		int orderMenuIndex = getFoodMenuIndex();
		
		//주문에 따른 매출, 재고 처리
		if(foodList.get(orderMenuIndex).stock > 0) {
			//재고 변경 
			//금액만큼 매출액 증가
			foodList.get(orderMenuIndex).modifyStock(-1); //1개주문만큼 재고감소
			
			totalSales += foodList.get(orderMenuIndex).price; //매출액 증가
			
			System.out.printf("[주문정보] %s 메뉴 %d개 주문완료! \n", foodList.get(orderMenuIndex).name, 1);
			
		} else {
			System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
		}
	}
	
	public int getFoodMenuIndex() { //메뉴를 선택하는 과정 담당 -> 선택한 메뉴의 인덱스 return
		Scanner scanner = new Scanner(System.in);
		int orderMenu;
		
		while(true) {
			showFoodList();
			//몇번 메뉴 주문할래?
			System.out.print(">>> 주문 메뉴 번호 입력 : ");
			orderMenu = scanner.nextInt();
			
			//정상메뉴 범위
			if(orderMenu >= 1 && orderMenu <= foodList.size()) { 
				break;
			} else {
				System.out.println(">>>잘못입력하셨습니다.");
				System.out.println(">>>메뉴 보기중에 선택하세요.");
			}
		}
		// orderMenu -> 인덱스 역할 orderMenu - 1
		
		int orderMenuIndex = orderMenu-1;
		return orderMenuIndex;
	}
	
	public void manageStock() { //재고관리
		
		Scanner scanner = new Scanner(System.in);
//		showFoodList();
		
		System.out.println(">>> 재고 관리할 메뉴 번호를 선택하세요.");
		int menuIndex = getFoodMenuIndex(); //재고관리할 메뉴 번호 입력
		
		System.out.print(">>> 재고 조정할 개수를 입력 : ");  //10   + 5 
		int stockCount = scanner.nextInt();
		foodList.get(menuIndex).modifyStock(stockCount); 
		//몇번인덱스에 있는 메뉴에게 너의 재고를 stockCount만큼 조정해라
		System.out.println("[재고 조정 적용]");
		System.out.println(foodList.get(menuIndex).getFoodInfo());
		System.out.println();
	}
	
	public void finishSales() {
		System.out.println();
		System.out.println("=====[영업마감]=====");
		isOpened = false;
		//매출 
		//남은재고  원가 %차감 (판매금액의 30%)
		int lossSales = 0;
		for(Food food : foodList) {
			lossSales += (food.price * 0.3 * food.stock);
		}
		
		//수익 얼마~
		System.out.println("----[마감정보]----");
		System.out.println(">>> 총매출액 : " + totalSales);
		System.out.println(">>> 원가차감 : " + lossSales);
		System.out.println(">>> 최종수익 : " + (totalSales-lossSales));
	}
}

/*
푸드트럭
- 푸드트럭은 여러종류의 음식들을 메뉴로 가지고 있을 수 있다.
- 각 음식들은 각각의 이름, 가격, 재고를 가지고 있다.
- 초기에 이름과 가격을 가지고 생성된다.
- 각 음식별 재고를 설정할 수 있다.
- 메뉴를 보여주는 기능(메뉴와 함께 주문가능한 재고까지)이 있다.
- 메뉴중 주문을 할 수 있으며, 주문 시 금액만큼 매출이 증가하고 재고가 떨어진다.
- 재고가 없는 메뉴는 판매할 수 없다.

-기능 기준 (메뉴보기, 주문하기, 재고관리(메뉴 재고 추가), 마감하기)

- 마감시 남은 재고만큼 매출액이 마이너스된다.
※마이너스 금액은 각 음식의 가격의 30% 원가
- 마감시 당일 매출액을 보여주고 종료됩니다.

김밥 1000 재고 50개
40개 -> 40,000원
10개 ->마감 -> 3000
매출 4만 - 폐기손해3천 최종수익 37000원
*/