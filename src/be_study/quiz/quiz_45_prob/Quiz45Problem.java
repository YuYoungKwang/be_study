package be_study.quiz.quiz_45_prob;

public class Quiz45Problem {

	public static void main(String[] args) {

//		method8_main();
		//method9_main();
//		method16_main();
//		method22_main();
//		method24_main();
//		method27_main();
		method44_main();
	}

	//8. 배열을 전달받아 모든 요소를 1 증가시키는 메서드를 작성하라. (원본 변경 확인)
	public static void method8_main() {
		
		// ----------8번문제 시작-------------
		int[] intArr = {1,2,3,4,5};

		int[] intArr2 = intArr;

		for(int n : intArr) {
			System.out.print(n + " ");
		}
		System.out.println();
		method8(intArr);
		for(int n : intArr) {
			System.out.print(n + " ");
		}
		System.out.println();

		int n = 10;
		System.out.println(n);
		method8_temp(n);
		System.out.println(n);
		n = method8_temp2(n);
		System.out.println(n);
		// ----------8번문제 끝-------------
	}

	public static void method8(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += 1;
		}
	}

	public static void method8_temp(int b) {
		b  = b + 1;
	}

	public static int method8_temp2(int b) {
		b  = b + 1;
		return b;
	}

	//16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드를 작성하라. (원본 확인)
	public static void method16_main() {
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "내이름";
		
		System.out.println(p1.age);
		p1.age = addAge(p1.age);   //p1.age += 1
		System.out.println(p1.age);
		
		p1 = addAge2(p1);
		System.out.println(p1.age);
		addAge3(p1); /*return 없음*/
		System.out.println(p1.age);
	}
	
	public static int addAge(int age) {
		return age + 1;
	}
	
	public static Person addAge2(Person p) {
		//Person p    :   age name 객체
		p.age = p.age + 1;
		return p;
	}
	
	public static void addAge3(Person p) {
		p.age = p.age + 1;
	}
	
	
	//22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라.
	public static void method22_main() {
		Person[] pArr = new Person[3];
		pArr[0] = new Person();
		pArr[1] = new Person();
		pArr[2] = new Person();
		
		pArr[0].age = 10;
		pArr[0].name = "10이름";
		
		pArr[1].age = 20;
		pArr[1].name = "20이름";
		
		pArr[2].age = 30;
		pArr[2].name = "30이름";
		
		System.out.println("총 합산 나이 : " + method22(pArr));
	}
	
	public static int method22(Person[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i].age;
		}
		return sum;
	}
	
	//24. Person 배열의 name만 따로 String[] 에 담아 리턴하는 메서드를 작성하라.
	public static void method24_main() {
		Person[] pArr = new Person[3];
		pArr[0] = new Person("10이름", 10);
		pArr[1] = new Person("20이름", 20);
		pArr[2] = new Person("30이름", 30);
		
		String[] arr = method24(pArr);
		//arr 은 이름만 가지고 있는 배열
		for(String s : arr) {
			System.out.println(s);
		}
	}
	
	public static String[] method24(Person[] arr) {
		String[] nameArr = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			nameArr[i] = arr[i].name;
		}
		return nameArr;
	}
	
	//27. 이름으로 Person을 검색하여 해당 객체를 리턴하는 메서드를 작성하라.
	public static void method27_main() {
		Person[] pArr = new Person[3];
		pArr[0] = new Person("10이름", 10);
		pArr[1] = new Person("20이름", 20);
		pArr[2] = new Person("30이름", 30);
		
		//이름으로 검색 "20이름"
		//"어떤 배열" 에서 이름이 "ㅇㅇ"인 객체를 찾겠다
		
		Person p = method27(pArr, "10이름");
		System.out.println(p.age);
	}
	
	
	public static Person method27(Person[] arr, String name) {
		//name 좀 찾아줘
		
		//찾아서 이름을 리턴? -> return String
		//찾아서 객체를 리턴! -> return Person
		
		Person p = null;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].name.equals(name)) {
				//return arr[i]; //이름이 같다고 찾은 사람 객체
				p = arr[i];
			}
		}
		return p;
	}
	
	//35. Person 객체를 복사(clone 비슷하게)해 새로운 Person을 리턴하는 메서드를 작성하라.
	//36. Person 배열을 전달받아 깊은 복사(deep copy)를 수행해 새 배열을 리턴하라.
	public static void method35_36_main() {
		Person[] pArr = new Person[3];
		pArr[0] = new Person("10이름", 10);
		pArr[1] = new Person("20이름", 20);
		pArr[2] = new Person("30이름", 30);
		
		System.out.println(pArr[0]);
		Person newP = method35(pArr[0]);
		System.out.println(newP);
		System.out.println(newP.toString());
		
		System.out.println(pArr[0].name);
		System.out.println(newP.name);
		System.out.println(pArr[0].age);
		System.out.println(newP.age);
	}
	
	
	public static Person method35(Person p) {
		// Person newP = p; XX
		Person newP = new Person(); // name:null age:0
		
		newP.age = p.age;
		newP.name = p.name;
		
		return newP;
	}
	
	public static Person[] method36(Person[] arr) {
		//Person[] newArr = arr;  //얕은복사 주소만!
		Person[] newArr = new Person[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			//newArr[i] = arr[i];
			newArr[i] = method35(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			Person newP = new Person();
			newP.name = arr[i].name;
			newP.age = arr[i].age;
			
			newArr[i] = newP;
		}
		
		return newArr;
	}
	
	
	//44. Person 배열을 전달받아 age 기준으로 정렬한 뒤 새 배열로 리턴하기.
	//정렬 
	//기준? age 숫자
	public static void method44_main() {
		Person[] pArr = new Person[5];
		pArr[0] = new Person("10이름", 10);
		pArr[1] = new Person("40이름", 40);
		pArr[2] = new Person("30이름", 30);
		pArr[3] = new Person("5이름", 5);
		pArr[4] = new Person("20이름", 20);
		
		
		//정렬전
		for(Person p : pArr) {
			System.out.println(p.name + " " + p.age);
		}
		
		Person[] pArrSorted = method44(pArr);
		
		System.out.println("=========정렬후=========");
		//정렬후
		for(Person p : pArrSorted) {
			System.out.println(p.name + " " + p.age);
		}
		
		
		//정렬 -> 정렬 알고리즘
		//정렬 방법
		
		/*
			20 10 30
			
			10 20 30
			
			arr[0] > arr[1]
			
			20 10 30 40 80 50
			
			10 20 30 40 50 80
			10 20 30 40 50
			10 20 30 40
			10 20 30
			10 20
			
		 */
	}
	
	public static Person[] method44(Person[] pArr) {
		// pArr[0].age > pArr[1].age
		
		//배열 복사
		//새 배열을 정렬
		// 정렬된 새 배열 return
		
		Person[] newArr = method36(pArr);
		
		//newArr 새로운 배열 
						//5  -1 = 4
		for(int i=0; i<newArr.length - 1; i++) {
			//0 1 2 3 
			
			//0 1 
			//  1 2
			//    2 3
			//      3 4
			
			//0 1 
			//  1 2
			//    2 3
			
			//0 1 
			//  1 2
			
			//0 1 
			for(int j = 0; j<newArr.length - 1 - i; j++) {
				if(newArr[j].age > newArr[j+1].age) {
					Person temp = newArr[j];
					newArr[j] = newArr[j+1];
					newArr[j+1] = temp;
				}
			}
		}
		
		return newArr;
		
		//			   3 2 1 0
//		for(int i=newArr.length-2; i>=0; i--) {
//			for(int j=0; j<=i; j++) {
//				
//			}
//		}
		
	}
	
}









