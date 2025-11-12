package be_study.refer;

public class Arr04 {

	public static void main(String[] args) {
		
		//배열 참조타입 vs 기본타입 int
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);
		
		b = 20;
		System.out.println(a + " " + b);
		
		//배열 복사
		
		
		/*
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1; //얕은복사   
		
		//얕은복사(shallow copy) vs  깊은복사(deep copy)
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2[0] = 99;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		*/
		
		//깊은 복사 값까지 포함해서 별도의 배열로 인식
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];
		
		
		/*
		//for문으로 각 변수값(int) 을 복사
		
		for(int i=0; i<3; i++) {
			arr2[i] = arr1[i];
		}
		*/
		
		//System.arraycopy(복사할대상, 복사할대상의 위치(index), 저장할대상, 저장할대상의 위치(index), 갯수(길이))
		//System.arraycopy(arr1, 0, arr2, 0, 3);
		System.arraycopy(arr1, 0, arr2, 1, 2);
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2[0] = 99;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		
	}

}
