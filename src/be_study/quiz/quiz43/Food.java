package be_study.quiz.quiz43;

public class Food {
	private String menu;
	private int price;
	private int stock;

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Food(String menu, int price) {
		this.menu = menu;
		this.price = price;
		this.stock = 0;
	}

	public Food(String menu, int price, int stock) {
		super();
		this.menu = menu;
		this.price = price;
		this.stock = stock;
	}

	public Food() {

	}

}
