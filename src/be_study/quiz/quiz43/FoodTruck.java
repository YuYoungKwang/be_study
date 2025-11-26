package be_study.quiz.quiz43;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {
	
	Scanner scanner = new Scanner(System.in);
	
	private ArrayList<Food> menuList = new ArrayList<Food>();
	private int revenue;
	private int lossAmount;

	public ArrayList<Food> getMenuList() {
		return menuList;
	}

	public void setMenuList(ArrayList<Food> menuList) {
		this.menuList = menuList;
	}

	public int getLossAmount() {
		return lossAmount;
	}

	public void setLossAmount(int lossAmount) {
		this.lossAmount = lossAmount;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public FoodTruck(ArrayList<Food> menuList) {
		this.menuList = menuList;
	}

	public FoodTruck() {
		revenue = 0;
		menuList.add(new Food("김밥", 2500));
		menuList.add(new Food("떡볶이", 3000));
		menuList.add(new Food("튀김", 3000));
		menuList.add(new Food("순대", 3000));
		menuList.add(new Food("어묵", 1000));
	}

	public void viewMenu() { // 메뉴보기
		System.out.printf("|%-8s|%8s|%8s|\n", "메뉴명", "가격", "재고");
		int num = 0;
		for (Food f : menuList) {
			num++;
			System.out.printf("|%d. %-6s|%8d|%8d|\n", num, f.getMenu(), f.getPrice(), f.getStock());
		}
	}

	public void order(int menuNum, int count) {
		if (menuList.get(menuNum - 1).getStock() >= count) {
			menuList.get(menuNum - 1).setStock(menuList.get(menuNum - 1).getStock() - count);
			revenue += menuList.get(menuNum - 1).getPrice() * count;
			System.out.println(menuList.get(menuNum - 1).getMenu() + " " + count + "개가 주문이 완료되었습니다.");
		} else {
			System.out.println("재고가 부족합니다. 다시 주문해주세요.");
		}
	}

	public void menuSreach(String menuName) {
		boolean hasMenu = false;
		for (Food f : menuList) {
			if (f.getMenu().equals(menuName)) {
				hasMenu = true;
				System.out.print("추가하실 메뉴의 재고을 입력해주세요. : ");
				int stock = scanner.nextInt();
				stockManagement(stock, f);
				break;
			}
		}
		
		if(!hasMenu) {
			System.out.println("해당 메뉴가 없습니다.");
			System.out.print("추가하실 메뉴의 가격을 입력해주세요. : ");
			int price = scanner.nextInt();
			System.out.print("추가하실 메뉴의 재고을 입력해주세요. : ");
			int stock = scanner.nextInt();
			stockManagement(menuName, price, stock);
		}
	}
	
	public void stockManagement(String menuName, int price, int stock) {
		menuList.add(new Food(menuName, price, stock));
	}

	public void stockManagement(int stock, Food f) {
		f.setStock(stock);
		System.out.println("재고 추가가 완료되었습니다.");
		viewMenu();
	}

	public void closeFoodTruck() {
		for (Food f : menuList) {
			lossAmount += (f.getPrice() * 0.3) * f.getStock();
		}
		System.out.println("매출: " + revenue + " 폐기 손해액 : " + lossAmount + " 순수익 : " + (revenue - lossAmount));
	}
}
