package be_study.quiz.quiz42.q2;

public class InterfaceType {
	public static void main(String[] args) {
		// 객체 생성
		Food food = new Food("족발", 19800);
		Electronics electronics = new Electronics("에어팟", 199000);
		Clothing clothing = new Clothing("셔츠", 49900);
		// 총합 계산
		int temp = 0;
		Orderable[] orderables = {food, electronics, clothing};
		for(Orderable o : orderables) {
			temp += o.discountedPrice();
		}
		// 결과 출력
		System.out.println("총합: " + temp + "원");
	}
}
