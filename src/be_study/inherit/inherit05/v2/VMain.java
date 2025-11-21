package be_study.inherit.inherit05.v2;

import java.util.ArrayList;
import java.util.List;

public class VMain {

	public static void main(String[] args) {
		
		//청소
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		DustCleaner dc = new DustCleaner();
		//dc.removeDust();
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		
		for(Cleaner c : list) {
			c.removeDust();
			c.washWindow();
			c.cleanFloor();
		}

		
	}

}










