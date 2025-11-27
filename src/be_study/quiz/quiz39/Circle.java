package be_study.quiz.quiz39;

public class Circle extends Shape {
	int radius; // 반지름

	@Override
	public double area() {
		/* 3. 원의 넓이를 구하도록 area()를 재정의하세요. */
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

	
}
