package be_study.inter.inter03;

public class InterfaceMain {

	public static void main(String[] args) {
		IPhone ip = new IPhone();
		GalaxyPhone gp = new GalaxyPhone();
		LGPhone lp = new LGPhone();
		
		Callable c1 = new IPhone();
		Callable c2 = new GalaxyPhone();
		Callable c3 = new LGPhone();
		
		Person p = new Person();
		p.callPhone = ip;
		p.call("1234");
		
		p.callPhone = lp;
		p.call("1234");
		
		p.callPhone = gp;
		p.call("1234");
		
		BluetoothSpeaker bs = new BluetoothSpeaker();
		Connectable ct = bs;
		//ct = ip;
		ct = gp;
		
		ct = new BluetoothSpeaker();
		ct = new GalaxyPhone();
	}

}
