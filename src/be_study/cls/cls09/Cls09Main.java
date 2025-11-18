package be_study.cls.cls09;

public class Cls09Main {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		
		int[] nArr = {10, 20, 30};
		int[] nArr1 = {n1, n2, n3};
		int[] nArr2 = new int[5];
		nArr2[3] = 100;
		
		for(int i=0; i<nArr.length; i++) {
			System.out.print(nArr[i] + " ");
		}
		System.out.println();
		
		for(int n : nArr2) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println( methodA(n2) );
		
		methodB(nArr);
		methodB(nArr2);
		
		//methodC(nArr);
		int[] cArr = methodC(null); //int[] arr = null OOOO
		//methodC(300);  //int[] arr = 300 XXXXXXXX
		methodB(cArr);
		
		System.out.println("-------------------------");
		Temp t1 = new Temp(); 
		Temp t2 = new Temp();
		Temp t3 = new Temp();
		
		Temp[] tArr = {new Temp(), new Temp(), new Temp()};
		Temp[] tArr1 = {t1, t2, t3};
		Temp[] tArr2 = new Temp[5]; //배열 공간 선언 5개짜리 new Temp[5]   []
		tArr2[3] = new Temp(); //객체생성  new Temp()  ()
		// null null null new Temp() null  
		
		for(int i=0; i<tArr.length; i++) {
			System.out.print(tArr[i].num);
			tArr[i].method();
		}
		System.out.println();
		
		for(Temp t : tArr1) {
			System.out.print(t.num);
			t.method();
		}
		System.out.println();

		//NullPointerException 
//		for(Temp t : tArr2) {  // {null null null new Temp() null} 
//			System.out.print(t.num);
//			t.method();
//		}
//		System.out.println();
		
		System.out.println("------------------");
		methodD(t2);
		methodD(tArr[0]);		//temp객체 전달
		
		methodE(tArr); //Temp[] 전달
		
		
		Temp tf = methodF(); //Temp 리턴
		methodD(tf);
		
		Temp[] tgArr = methodG(); //Temp[] 리턴 
		methodE(tgArr);  
	} 
	
	public static int methodA(int n) {
		return n + 10;
	}
	
	public static void methodB(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] methodC(int[] arr) {
		
		int[] ar = {5,4,3,2,1};
		
		return ar;
	}
	
	public static void methodD(Temp t) {
		System.out.println(t.num);
		t.method();
	}
	
	public static void methodE(Temp[] arr) {
		for(Temp t : arr) {
			System.out.print(t.num);
			t.method();
		}
		System.out.println();
	}
	
	public static Temp methodF() {
		Temp t = new Temp();
		t.num = 99;
		return t;
	}
	
	//Temp[] t = arr
	public static Temp[] methodG() {
		Temp[] arr = new Temp[2];
		arr[0] = new Temp();
		arr[1] = new Temp();
		
		return arr;
	}
}
