package be_study.cls.cls04;

public class IPadMain {

	public static void main(String[] args) {
		
		IPad ip1 = new IPad();
		ip1.showInfo();
		
		
		IPad ip2 = new IPad();
		ip2.owner = "유재석";
		ip2.showInfo();
		
		ip2.returnCheck();
		
	}

}
