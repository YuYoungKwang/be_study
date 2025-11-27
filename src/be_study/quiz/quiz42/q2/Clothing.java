package be_study.quiz.quiz42.q2;

public class Clothing implements Orderable {

	private String name;
	private int price;

	public Clothing(String name, int price) {
	this.name = name;
	this.price = price;
	}
	
	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		return (int)(price * 0.7);
	}

}
