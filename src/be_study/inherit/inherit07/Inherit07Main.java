package be_study.inherit.inherit07;

public class Inherit07Main {

	public static void main(String[] args) {
		
		//Object 객체
		
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		System.out.println(d.toString());
		System.out.println(t.toString());
		System.out.println(b.toString());
		
		d.driveBus(b);
		d.driveTaxi(t);
		
		//  method(int a)
		//  method(String s)
		
		Vehicle v1 = new Taxi();
		Vehicle v2 = new Bus();
		Vehicle v3 = new Vehicle();
		
		d.drive(v1);
		d.drive(v2);
		d.drive(v3);
		
		System.out.println("Vehicle 매개변수에 Taxi, Bus 전달 가능");
		Taxi t1 = new Taxi();
		Bus b1 = new Bus();
		d.drive(t1);
		d.drive(b1);
		
		
		Taxi t2 = takeTaxi();
		Bus b2 = takeBus();
		
		Vehicle v10 = takeTaxi();
		Vehicle v11 = takeBus();
		
		//Bus b10 = takeBus2();  //X //return 타입 -> Vehicle 
		
		//Vehicle v = new Bus();
		//Bus b = v		XX
		Vehicle v12 = takeBus2();
		if(v12 instanceof Bus) {
			Bus b12 = (Bus)v12;
		}
	}

	public static Taxi takeTaxi() {  //Taxi t = new Taxi();
		return new Taxi();
	}
	
	public static Bus takeBus() {  //Bus b = new Bus();
		return new Bus();
	}
	
	public static Vehicle takeBus2() { // Vehicle v = new Bus();
		return new Bus();
	}
	
}












