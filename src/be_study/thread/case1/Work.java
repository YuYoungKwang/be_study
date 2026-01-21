package be_study.thread.case1;

public class Work {
	int workCount;
	
	public Work() {
		workCount = 0;
	}
	
	//충돌방지 
	//public synchronized void addCount() {
	public void addCount() {
		workCount++;
	}
}
