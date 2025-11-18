package be_study.cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		//ArrayList 개념
		
		//기본 배열
		String[] sArr1 = new String[4]; //4칸 배열!
		sArr1[0] = "A";
		sArr1[1] = "B";
		sArr1[2] = "C";
		sArr1[3] = "D";
		
		//sArr1[4] = "E";
		String[] sArr2 = new String[5];
		for(int i=0; i<sArr1.length; i++) { //0 1 2 3
			sArr2[i] = sArr1[i];
		}
		sArr2[4] = "E";
		
		for(String s : sArr2) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//ArrayList
		//ArrayList<저장할타입> 변수명 = new ArrayList<저장할타입>();
		System.out.println("--------ArrayList---------");
		
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("A"); //List에 값 추가 .add
		sList.add("B");
		sList.add("C");
		sList.add("D");
		sList.add("E");
		sList.add("F");
		
		for(String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//List의 길이 list.size()  
		for(int i=0; i<sList.size(); i++) {
			// List의 특정 인덱스 위치의 값 접근  .get(index)  arr[i]
			System.out.print(sList.get(i) + " ");
		}
		
		System.out.println();
		
		//List에 값이 있는지 확인 .contains(값)
		if(sList.contains("B"))
			System.out.println("contains 결과가 true면 B가 이미 있다");
		else
			System.out.println("List에 B가 없다");
		
		if(sList.contains("G") == false) {
			sList.add("G");
		}
		
		for(int i=0; i<sList.size(); i++) {
			// List의 특정 인덱스 위치의 값 접근  .get(index)  arr[i]
			System.out.print(sList.get(i) + " ");
		}
		System.out.println();
		
		// arr[2] = "H";
		// list.get(2) ??
		
		//list의 특정위치에 값을 저장  set
		sList.set(2, "H");
		for(int i=0; i<sList.size(); i++) {
			// List의 특정 인덱스 위치의 값 접근  .get(index)  arr[i]
			System.out.print(sList.get(i) + " ");
		}
		System.out.println();
		
		//삭제 remove(index)  remove(값)         // arr[i] = null;
		sList.remove(2);
		sList.remove("F");
		
		for(int i=0; i<sList.size(); i++) {
			// List의 특정 인덱스 위치의 값 접근  .get(index)  arr[i]
			System.out.print(sList.get(i) + " ");
		}
		System.out.println();
	}

}
