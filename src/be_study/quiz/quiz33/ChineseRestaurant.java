package be_study.quiz.quiz33;

import java.util.ArrayList;

public class ChineseRestaurant {
	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
		// 메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		
		ArrayList<Menu> menuList = new ArrayList<Menu>(); //초기화 선언
		menuList.add(jjajang);
		menuList.add(jjambbong);
		menuList.add(tangsook);
		
		Order order = new Order(123, menuList);
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		
		//Menu[] menuArr2 = { jjajang, jjajang, new Menu("짜장",5900), new Menu("짜장", 7900) };
//		Menu[] menuArr2 = { jjajang, jjajang, jjambbong, jjambbong, jjambbong, tangsook } ;
//		Order order2 = new Order(223, menuArr2);
		ArrayList<Menu> menuList2 = new ArrayList<Menu>();
		menuList2.add(jjajang);
		menuList2.add(jjajang);
		menuList2.add(jjambbong);
		menuList2.add(jjambbong);
		menuList2.add(jjambbong);
		menuList2.add(tangsook);
		Order order2 = new Order(223, menuList2);
//		//System.out.println("주문번호 " + order2.orderNum + "번 고객님 총금액은 " + order2.totalPrice() + "");
		System.out.printf("주문번호 %d번 고객님 총금액 %d원입니다.\n", order2.orderNum, order2.totalPrice());
	}
}
