package be_study.quiz.quiz32;

public class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;
	// 생성자
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		
		//시킨 메뉴를 모두 확인하고
		//그 메뉴 안에 들어있는 금액을 보고
		// 다 더하기~
		
		//현재 주문의 메뉴들은 다 menus 배열
		int total = 0;
		for(int i=0; i<menus.length; i++) {
			total += menus[i].price;
		}
		
//		for(Menu m : menus) {
//			total += m.price;
//		}
		
		return total;
	}

}
