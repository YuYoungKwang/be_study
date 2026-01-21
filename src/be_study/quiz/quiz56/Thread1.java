package be_study.quiz.quiz56;

//		Thread 상속
public class Thread1 extends Thread {

	//메소드 - 재정의
	public void run() {
		for(int i=1; i<=100; i = i + 2) {
			System.out.println("Thread1 : "+i);
			
			try {
				//ms 단위 
				Thread1.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
