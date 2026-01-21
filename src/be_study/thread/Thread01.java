package be_study.thread;

//		Thread 상속
public class Thread01 extends Thread {

	//메소드 - 재정의
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			try {
				//ms 단위 
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
