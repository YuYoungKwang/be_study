package be_study.thread.case2;

public class Work implements Runnable {

	int workCount;
	int workLoad;
	
	public Work(int workLoad) {
		this.workLoad = workLoad;
		this.workCount = 0;
	}
	
	public void addCount() {
		workCount++;
	}
	
	@Override
	public void run() {
		
		while(workCount < workLoad) {
			
			synchronized (this) {
				addCount();
				System.out.println(Thread.currentThread().getName() + " workCount : " + workCount);
			}
			
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
}
