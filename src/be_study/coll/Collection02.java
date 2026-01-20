package be_study.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection02 {

	public static void main(String[] args) {
		//Set
		//중복허용X
		
		//Set<Dept> set1 = new HashSet<Dept>();
		Set<Integer> set1 = new HashSet<Integer>();
		Set<String> set2 = new HashSet<String>();
		
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("A");
		set2.add("B");
		set2.add("A");
		set2.add("B");
		set2.add("A");
		set2.add("B");
		
		System.out.println(set2.size());
		System.out.println(set2.isEmpty());
		System.out.println(set2.contains("C"));
	
		for(String s : set2) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		
		Iterator<String> it2 = set2.iterator();
		
		// iterator
		// hasNext() : 다음값 가지고 있나? 
		// next()   : 다음 값 불러오기
		
		while(it2.hasNext()) { //다음값있니? true false
			String s = it2.next();  //다음값 가져와
			System.out.println(s);
		}
	}

}

















