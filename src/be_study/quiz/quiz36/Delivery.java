package be_study.quiz.quiz36;

public class Delivery {
	String[] nameList = {"김민수", "이지은", "박성현", "최다혜", "정우진", "윤서연", "장민호", "한지민", "오세준", "백지호"};
	String[] employmentList = {"맹호배달", "패스트콜123", "총알배달", "행복주문"};
	
	int[] employmentNum = new int[nameList.length];
	boolean[] hasDeliveryList = new boolean[nameList.length];
	
	Order order;
	
	String name;
	String employment;
	boolean hasDelivery;
	

	public Delivery() {
		for(int i = 0; i < employmentNum.length; i++) {
			employmentNum[i] = (int)(Math.random()*4);
			if((int)(Math.random()*2) == 0) {				
				hasDeliveryList[i] = false;
			}else {
				hasDeliveryList[i] = true;
			}
		}
		
	}
}
