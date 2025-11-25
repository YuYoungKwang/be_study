package be_study.inter.inter03;

public interface Callable {  //~할수있는~ 

	//전화 상태 코드
	public static final int CALL_ON = 1; //전화중
	public int CALL_OFF = 2; //전화 안하는 상태
	
	// Callable.CALL_ON
	// Callable.CALL_OFF
	
	public void call();
}
