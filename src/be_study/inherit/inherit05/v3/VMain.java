package be_study.inherit.inherit05.v3;

import java.util.ArrayList;
import java.util.List;

public class VMain {

	public static void main(String[] args) {
		
		//청소
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
		
		//동일한 사용방법으로 다양한 실행 결과를 도출
		for(Cleaner c : list) {
			c.doClean();
		}

		
	}

}










