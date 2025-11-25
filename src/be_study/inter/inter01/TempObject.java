package be_study.inter.inter01;

//상속: 부모클래스를 상속받겠다. 확장하겠다.

//인터페이스를 구현하겠다
public class TempObject implements Temp2Interface, TempInterface {

	@Override
	public void method1() {
		System.out.println("method1()");
	}

	@Override
	public void method2() {
		System.out.println("method2()");
	}
	
	public void method99() {
		System.out.println("method99()");
	}

	@Override
	public void method3() {
		System.out.println("method3()");
	}
	
}
