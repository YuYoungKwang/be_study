package be_study.thread.case1;

public class Case1Main {

	public static void main(String[] args) {
		
		Work work = new Work();
		//int n = 0;
		
		// (w1)Thread1.start() -> Worker.run() -> (addCnt()-> Work <- addCnt()) <- Worker.run()  <-  (w2)Thread1.start()
		
		Worker w1 = new Worker("A", 30, work);
		Worker w2 = new Worker("B", 30, work);
		
		w1.start(); //쓰레드 실행
		w2.start(); 
	}
}
