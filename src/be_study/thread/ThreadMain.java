package be_study.thread;

public class ThreadMain {

	public static void main(String[] args) {

		//thread
		
		//단일 쓰레드(싱글쓰레드)
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i=11; i<=20; i++) {
//			System.out.println(i);
//		}
		
		Thread01 t1 = new Thread01();
		Thread01 t2 = new Thread01();
		
//		t1.run();  //단순 run() 메소드 호출
//		t2.run();
		
		t1.start(); //쓰레드 방식으로 실행  -> 내부에서 run() 메소드를 사용
		t2.start(); 
		
		// 부모타입 변수 = 자식객체
		Thread t3 = new Thread01();
		t3.start();
		
		Thread02 t22 = new Thread02();  //Runnable 인터페이스 구현객체
		//new Thread(Runnable task); 쓰레드 생성
		
		Thread t33 = new Thread(t22);
		t33.start();
		
		Thread t44 = new Thread(new Thread02());
		t44.start();
		
		System.out.println(t44.getName());
		System.out.println("Thread Main End --------------");
	}

}
