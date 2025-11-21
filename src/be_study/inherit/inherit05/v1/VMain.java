package be_study.inherit.inherit05.v1;

import java.util.ArrayList;
import java.util.List;

public class VMain {

	public static void main(String[] args) {
		
		//청소
//		DustCleaner dc1 = new DustCleaner();
//		DustCleaner dc2 = new DustCleaner();
//		DustCleaner dc3 = new DustCleaner();
//		dc1.removeDust();
//		dc2.removeDust();
//		dc3.removeDust();
		
		DustCleaner[] dustArr = new DustCleaner[3];
		dustArr[0] = new DustCleaner();
		dustArr[1] = new DustCleaner();
		dustArr[2] = new DustCleaner();
		
		//ArrayList<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
		List<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		
		for(int i=0; i<dustArr.length; i++) {
			dustArr[i].removeDust(); //먼지털이 청소 시키기
		}
		
		for(int i=0; i<windowList.size(); i++) {
			windowList.get(i).washWindow();
		}
		
		for(FloorCleaner fc : floorList) {
			fc.cleanFloor();
		}
		
	}

}










