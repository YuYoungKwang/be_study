package be_study.quiz.quiz41;

public class Food {

	String name; //이름
	int price; //가격
	int stock; //재고
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		//this.stock = 0;
		this.stock = 5;
		// 초기 재고수량은 5개로 가정한다
	}

	//재고를 설정할 수 있다.
	
	//1. 그냥 세팅 setStock(5)
	public void setStock(int stock) {
		this.stock = stock;
	}
	//2. 재고가 변경이된다. 재고조정(-2)
	//   재고조정(20) 
	// 재고Up 재고Down
	public void modifyStock(int count) {
		
		// 처리방향
		// 0보다 작아진다? -> 실패 불가
		// 0보다 작아진다? -> 그냥 0으로 처리
		if( (stock + count) < 0) {
			// 3   + -5
			stock = 0;
		} else {
			stock += count;
		}
//		stock += count;
//		stock -= count;
	}
	
	//Food 자체의 현재 정보 String 반환
	//public String toString() {
	public String getFoodInfo() {
		return String.format("%s : %d원 (잔여재고:%d)", name, price, stock);
	}
}












