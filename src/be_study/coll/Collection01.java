package be_study.coll;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		
		//ArrayList
		//Set
		//Map
		
		String s1 = "A";
		String s2 = "B";
		
		String[] sArr = new String[3];
		sArr[0] = "A";
		sArr[1] = "B";
		sArr[2] = "C";
		
		for(int i=0; i<sArr.length; i++) {
			System.out.print(sArr[i] + " ");
		}
		System.out.println();
		
		for(String s : sArr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		//Ctrl + Shift + O  자동임포트~
		List<String> list1 = new ArrayList<String>();
		list1.add("D");
		list1.add("E");
		list1.add("F");
		
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		for(String s: list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		List<String> list2 = null;
		//list2.add("G");
		
		list1.add(2, "H"); //2인덱스에 "H" 추가 (뒤로 밀림)
		list1.set(1, "I"); //1인덱스에 "I" 로 변경(저장)
		
		for(String s: list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		list1.remove(0);
		list1.remove("H");
		
		for(String s: list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		//---------------------------------
		int n1 = 10;
		int n2 = 20;
		int[] nArr = new int[5];
		
		
		//List처리는 객체 타입
		//List<int> list3 = new ArrayList<int>();  XX
		List<Integer> list3 = new ArrayList<Integer>();
		// Integer.parseInt
		
		//포장객체 Wrapper Class
		
		//int Integer
		//double Double
		//boolean Boolean
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		
		System.out.println(list3.isEmpty());
		System.out.println(list3.size());
		System.out.println(list3.contains(40));
		System.out.println(list3.contains(50));
		
		//for(Integer n : list3) {
		for(int n : list3) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
















