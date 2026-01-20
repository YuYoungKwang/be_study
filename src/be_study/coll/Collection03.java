package be_study.coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection03 {

	public static void main(String[] args) {
		//Map
		
		//HashMap
		// key value
		
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		//map 추가 put
		//map 조회 get
		
		map1.put(1, "하나");
		map1.put(2, "둘");
		map1.put(3, "셋");
		map1.put(4, "넷");
		
		map1.remove(4);
		
		System.out.println(map1.size());
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsValue("둘"));
		System.out.println(map1.containsValue("다섯"));
		
		System.out.println(map1.get(1));
		
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("규칙1", "지각안하기");
		map2.put("규칙2", "결석안하기");
		map2.put("공지", "스트레칭하기");
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey("공지"));
		System.out.println(map2.containsValue("결석하기"));
		
		//map 값 접근 
		
		System.out.println("--------map key----------");
		//map2.keySet() //key들만 들어있는 set
		
		for(int s : map1.keySet()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(String s : map2.keySet()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("--------map value----------");
		for(String s : map1.values()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(String s : map2.values()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		for(String key : map2.keySet()) {
			
			System.out.println(key + ":" + map2.get(key) + " ");
		}
		System.out.println();
		
		System.out.println("--------map entrySet----------");
		for(Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("--------map object 객체----------");
		Map<String, Temp> pMap = new HashMap<String, Temp>();
		
		pMap.put("본진", new Temp(100, 200));
		
		Temp t1 = new Temp(300, 500);
		pMap.put("적멀티", t1);
		pMap.put("내멀티", new Temp(150, 350));
	
		for(String key : pMap.keySet()) {
			System.out.println(key + " " + pMap.get(key));
			System.out.println(key + " " + pMap.get(key).getX() + " "  + pMap.get(key).getY());
			
			Temp t = pMap.get(key);
			System.out.println(t.getX() + " , " + t.getY());
		}
	}

}


class Temp {
	int x;
	int y;
	
	public Temp(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Temp [x=" + x + ", y=" + y + "]";
	}
}

















