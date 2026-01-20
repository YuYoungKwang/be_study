package be_study.quiz.quiz40.q2;

import java.util.ArrayList;

public class InterfaceType {
	public static void main(String[] args) {
		// 객체 생성
		Food f = new Food("족발", 19800);
		Electronics e = new Electronics("에어팟", 198000);
		Clothing c = new Clothing("셔츠", 49900);
		// 총합 계산
		// f.price + e.price....XX private price
		int sum = f.discountedPrice() + e.discountedPrice() + c.discountedPrice();
		// 결과 출력
		System.out.println("총합 : " + sum + "원");
		
		//Orderable[]
		ArrayList<Orderable> orderList = new ArrayList<Orderable>();
		orderList.add(new Food("족발", 19800));
		orderList.add(new Electronics("에어팟", 198000));
		orderList.add(new Clothing("셔츠", 49900));
		
		sum = 0;
		for(Orderable o : orderList) {
			sum += o.discountedPrice();
		}
		System.out.println("총합 : " + sum + "원");
		
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	public int discountedPrice() {
		//할인율을 적용한 후 금액
		
		//return (int)(price * 0.9);
		return price - (int)(price*0.1);
		
		//1) 기존금액에 할인율 적용되면 얼마다! return
		// 할인율 10%   price*0.9
		
		//2) 기존금액에 할인율 적용해서 할인된 금액으로 변경저장! 변경된 금액을 return
		// 할인율 10% price = price * 0.9;      return price;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	public int discountedPrice() {
		return price - (int)(price*0.2);
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	public int discountedPrice() {
		return price - (int)(price*0.3);
	}
}