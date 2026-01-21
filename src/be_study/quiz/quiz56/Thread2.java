package be_study.quiz.quiz56;

//		Thread 상속
public class Thread2 extends Thread {

	//메소드 - 재정의
	public void run() {
		for(int i=2; i<=100; i= i + 2) {
			System.out.println("Thread2 : " + i);
			
			try {
				//ms 단위 
				Thread2.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
