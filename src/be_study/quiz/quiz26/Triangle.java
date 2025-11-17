package be_study.quiz.quiz26;

public class Triangle {
	int width; //밑변
	int height; //높이
	
	//double width; //밑변
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return (double)width * height / 2.0;
		//return width * height / 2;
		//		 int * int  / int  => int 
		// double 변수 = int값
	}
}	



