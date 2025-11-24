package be_study.quiz.quiz36;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Pizza pizza = new Pizza();
		Order order = new Order();
		Customer customer = new Customer();
		Delivery delivery = new Delivery();
		order.pizzaList = new ArrayList<Pizza>();
		System.out.println("피자 주문을 시작합니다.");
		order.orderNum = 0;
		while(true) {
			int pizzaSelect = 0;
			while(true) {
				for(int i = 0; i < pizza.pizzaList.length; i++) {
					System.out.println((i + 1) + ". " + pizza.pizzaList[i]);
				}
				System.out.print("피자를 선택해주세요. : ");
				pizzaSelect = scanner.nextInt();
				
				if(pizzaSelect > pizza.pizzaList.length) {
					System.out.println("잘못 누르셨습니다. 다시선택해주세요");
				}else {
					break;
				}
			}
			
			int sizeSelect = 0;
			
			while(true) {				
				for(int i = 0; i < pizza.sizeList.length; i++) {
					System.out.println((i + 1) + ". " + pizza.sizeList[i]);
				}
				System.out.print("사이즈를 선택해주세요. : ");
				sizeSelect = scanner.nextInt();
				
				if(sizeSelect > pizza.sizeList.length) {
					System.out.println("잘못 누르셨습니다. 다시선택해주세요");
				}else {
					break;
				}
			}
			
			Pizza orderPizza = new Pizza(pizza.pizzaList[pizzaSelect - 1], pizza.sizeList[sizeSelect - 1]);
			order.pizzaList.add(orderPizza);
			
			int nextSelect = 0;
			
			while(true) {
				System.out.print("메뉴를 더 선택하시려면 1을, 다음 단계로 가시려면 2를 입력해주세요. : ");
				nextSelect = scanner.nextInt();
				if(nextSelect == 1 || nextSelect == 2) {
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			
			if(nextSelect == 2) {
				order.orderNum++;
				break;
			}
			
		}
		
		order.customer = new Customer();
		
		System.out.print("이름을 입력해주세요. : ");
		order.customer.name = scanner.next();
		System.out.print("전화번호를 입력해주세요. : ");
		order.customer.tel = scanner.next();
		System.out.print("주소를 입력해주세요. : ");
		order.customer.address = scanner.next();
		
		int deliveryIndex = 0;
		//배달원 조회
		for(int i = 0; i < delivery.hasDeliveryList.length; i++) {
			if(!delivery.hasDeliveryList[i]) {
				break;
			}
			deliveryIndex++;
		}
		
		delivery.order = new Order();
		delivery.order = order;
		delivery.name = delivery.nameList[deliveryIndex];
		delivery.employment = delivery.employmentList[deliveryIndex];
		delivery.hasDelivery = true;
		
		System.out.println("============주문내역===========");
		
		
		int menuCount = 1;
		for(Pizza p : delivery.order.pizzaList) {
			System.out.println(menuCount+". " + p.pizza + "    " + p.size);	
			menuCount++;
		}
		System.out.println("=============================");
		System.out.println("============고객정보============");
		System.out.println("성함: " + delivery.order.customer.name);
		System.out.println("전화번호: " + delivery.order.customer.tel);
		System.out.println("주소: " + delivery.order.customer.address);
		System.out.println("=============================");
		System.out.println("============배달원 정보============");
		System.out.println("배달원 : " + delivery.name);
		System.out.println("소속 : " + delivery.employment);
		System.out.println("=============================");
		
	}

}
