package be_study.quiz.quiz36;

import java.util.ArrayList;

public class Order {
	int orderNum;
	ArrayList<Pizza> pizzaList;
	Customer customer;
	public Order() {
	
	}
	
	public Order(int orderNum, ArrayList<Pizza> pizzaList, Customer customer) {
		this.orderNum = orderNum;
		this.pizzaList = pizzaList;
		this.customer = customer;
	}
	
	
}
