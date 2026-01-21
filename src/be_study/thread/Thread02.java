package be_study.thread;

// Runnable 인터페이스 구현
public class Thread02 implements Runnable  {

	@Override
	public void run() {
		for(int i=11; i<=20; i++) {
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
