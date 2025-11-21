package be_study.inherit.inherit05.v4;

import java.util.ArrayList;
import java.util.List;

public class VMain {

	public static void main(String[] args) {
		
		//강제 타입변환
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		
		DustCleaner dc = (DustCleaner)c2;
		//DustCleaner dc2 = (DustCleaner)c1;
		
		Cleaner c3 = new FloorCleaner();
		Cleaner c4 = new WindowCleaner();
		
		//WindowCleaner wc = (WindowCleaner)c3;
		FloorCleaner fc = (FloorCleaner)c3;
		WindowCleaner wc = (WindowCleaner)c4;
		
		
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
			
			if(c instanceof DustCleaner) {
				DustCleaner dcc = (DustCleaner)c;
				dcc.arrangeItem();
			}
		}

		
	}

}











