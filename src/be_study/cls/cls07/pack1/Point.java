package be_study.cls.cls07.pack1;

public class Point {
	//점수 관리
	int math; //수학  default
	public int eng; //영어
	private int lang; //국어
	
	//private Point(){}
	public Point(){}
	
	public Point(int math, int eng, int lang){
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}
	
	void method1() {
		System.out.println("method1");
	}
	
	public void method2() {
		System.out.println("method2");
	}
	
	private void method3() {
		System.out.println("method3");
	}
	
	//Setter 저장용
	//setXXX
	public void setMath(int math) {
		this.math = math;
	}
	
	public void setEng(int eng) {
		//메소드는 로직 코드 등 더 작성 가능
		
		//0~100 이 아닌 잘못된 숫자를 입력하면
		//이건 점수입력실수로 0점 처리함!
		if(eng >= 0 && eng <= 100) { //정상범위
			this.eng = eng;
		} else {
			this.eng = 0;
		}
	}
	
	public void setLang(int lang) {
		this.lang = lang;
	}
	
	
	public int getMath() {
		return this.math;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getLang() {
		//return this.lang;
		//1000점 만점으로 환산해서 반환
		//0~100 -> *10
		return this.lang * 10;
	}
	
	
}
