package be_study.quiz.quiz33;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Person yuyoungkwang = new Person("유영광" , 27);
		System.out.println("====================================================");
		System.out.println("11. name : " + yuyoungkwang.getName() + " age : "	+ yuyoungkwang.getAge());
		System.out.println("====================================================");
		
		
		System.out.println("====================================================");
		System.out.print("12. ");
		yuyoungkwang.hello();
		System.out.println("====================================================");
		
		
		person.nameOutput(new Person("이광진"));
		
		Person leesangjun = person.setPerson();
		
		System.out.println("====================================================");
		System.out.println("14. name : " + leesangjun.getName() + " age : "	+ leesangjun.getAge());
		System.out.println("====================================================");
		
		Person leejihoon = new Person("이지훈", 24);
		Person leejongsung = new Person("이종성", 34);
		
		System.out.println("====================================================");
		System.out.print("15. Person 두 명을 만들어 age가 큰 사람을 출력 : ");
		person.ageUpper(leejihoon, leejongsung);
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.print("16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드 : ");
		person.agePlus(leejongsung);
		person.printPerson(leejongsung);
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.println("17. Person을 만들고, 그 객체의 참조를 두 변수에 나눠 담은 뒤 값 변경 테스트 : ");
		Person aboubacarToungara = new Person("aboubacarToungara", 32);
		System.out.print("aboubacarToungara : ");
		aboubacarToungara.printPerson(aboubacarToungara);
		Person aboubacarToungara2 = aboubacarToungara;
		aboubacarToungara2.setName("Aboubacar Toungara"); 
		System.out.print("aboubacarToungara : ");
		aboubacarToungara.printPerson(aboubacarToungara);
		System.out.print("aboubacarToungara2 : ");
		aboubacarToungara2.printPerson(aboubacarToungara2);
		System.out.println("====================================================");
		
		Person[] persons = new Person[3];
		persons[0] = new Person("Koo Jong-Uk", 30);
		persons[1] = new Person("Kim Won-Sik", 35);
		persons[2] = new Person("Kim Seong-Jun", 38);
		
		System.out.println("====================================================");
		System.out.println("18. Person 배열을 만들어 3명을 채워 넣고 이름을 출력하라.");
		for(Person p : persons) {
			System.out.print(p.getName() + "   ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.println("19. Person 배열을 매개변수로 받아 모든 사람의 hello()를 호출하라.");
		person.personHello(persons);
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.println("20. Person 배열을 만들어 가장 나이가 많은 사람을 리턴하는 메서드를 작성하라.");
		Person oldMan = person.maxAge(persons);
		person.printPerson(oldMan);
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.println("21. 길이를 입력받아 Person 배열을 생성해 리턴하는 메서드를 작성하라.");
		Person[] randomPerson = person.personArr(5);
		for(Person s : randomPerson) {			
			person.printPerson(s);
		}
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		int totalAge = person.totalAge(randomPerson);
		System.out.println("22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라. : " + totalAge);
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.println("23. Person 배열을 전달하면, 모든 나이를 10으로 초기화하는 메서드를 만들어라.");
		person.all10Age(randomPerson);
		for(Person s : randomPerson) {			
			person.printPerson(s);
		}
		System.out.println("====================================================");

		System.out.println("====================================================");
		System.out.println("24. Person 배열의 name만 따로 String[] 에 담아 리턴하는 메서드를 작성하라.");
		String[] names = person.allName(randomPerson);
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		//25. Person을 생성해서 배열 인덱스 0에 넣는 방법을 코드로 작성하라.
		Person personSample = new Person("이광준", 30);
		Person[] personArr = new Person[5];
		personArr[0] = personSample;
		
		//26. Person 배열 일부 요소는 null일 때, null 검사를 하며 출력하는 코드를 작성하라.
		personArr[1] = new Person("윤용호", 30);
		personArr[2] = null;
		personArr[3] = null;
		personArr[4] = new Person("장성재", 31);
		System.out.println("====================================================");
		System.out.println("26. Person 배열 일부 요소는 null일 때, null 검사를 하며 출력하는 코드를 작성하라.");
		for(int i = 0; i < personArr.length; i++) {
			if(personArr[i] == null) {
				System.out.println((i + 1)+"번. "+"데이터가 없습니다");
			}else {
				System.out.print((i + 1)+"번.");
				person.printPerson(personArr[i]);
			}
		}
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.println("27. 이름으로 Person을 검색하여 해당 객체를 리턴하는 메서드를 작성하라.");
		person.printPerson(person.nameSearch(personArr, "장성재"));
		System.out.println("====================================================");
		
//		28. Person 배열을 생성하되, 짝수 인덱스에만 객체를 넣고 나머지는 null로 두어라.
		System.out.println("====================================================");
		System.out.println("28. Person 배열을 생성하되, 짝수 인덱스에만 객체를 넣고 나머지는 null로 두어라.");
		Person[] evenArr = new Person[6];
		for(int i = 0; i < evenArr.length; i+=2) {
			evenArr[i] = new Person("RandomName"+i,(int)(Math.random()*65)+1);
		}
		int evenCount = 0;
		for(Person p : evenArr) {
			if( p != null) {
				System.out.print(evenCount + "번째 인덱스 : ");
				person.printPerson(p);
			}else {
				System.out.print(evenCount + "번째 인덱스 : ");
				System.out.println("null!");
			}
			evenCount++;
		}
		System.out.println("====================================================");
//		29. Person을 전달받아 새로운 Person을 만들어 반환하되, name만 복사해라.
		System.out.println("====================================================");
		System.out.println("29. Person을 전달받아 새로운 Person을 만들어 반환하되, name만 복사해라.");
		person.printPerson(person.newPersonName(personSample));
		System.out.println("====================================================");
//		30. Person 배열을 전달받아, age가 30 이상인 사람만 새로운 배열로 리턴하라
		System.out.println("====================================================");
		System.out.println("30. Person 배열을 전달받아, age가 30 이상인 사람만 새로운 배열로 리턴하라.");
		Person[] age30PersonArr = person.personArr(10);
		ArrayList<Person> returnAge30Arr = person.age30Persons(age30PersonArr);
		for(Person p : returnAge30Arr) {
			person.printPerson(p);
		}
		System.out.println("====================================================");
		
//		🔹 4단계: 원시타입 배열 + 객체 배열 + 메서드 섞기 (31~40)
//		31. int 배열과 Person 배열을 모두 출력하는 메서드를 각각 만들어라.
		
		int[] intArr = {1, 2, 3, 4, 5};
		Person[] personArr31 = person.personArr(5);
		
		System.out.println("====================================================");
		System.out.println("31. int 배열과 Person 배열을 모두 출력하는 메서드를 각각 만들어라.");
		person.intArrOutput(intArr);
		person.personArrOutput(personArr31);
		System.out.println("====================================================");
		
//		32. Person 배열과 int 배열을 동시에 매개변수로 받아 조합해 출력하는 메서드를 작성하라.
		
		System.out.println("====================================================");
		System.out.println("32. Person 배열과 int 배열을 동시에 매개변수로 받아 조합해 출력하는 메서드를 작성하라.");
		person.personPlusInt(personArr31, intArr);
		System.out.println("====================================================");
		
//		33. Person 배열의 age 값을 int 배열로 변환하는 메서드를 작성하라.
		
		System.out.println("====================================================");
		System.out.println("33. Person 배열의 age 값을 int 배열로 변환하는 메서드를 작성하라.");
		person.intArrOutput(person.ageIntArrConvert(personArr31));
		System.out.println("====================================================");
		
//		34. int 배열을 전달받아 Person 배열로 변환하라(각 age만 채우기).
		
		System.out.println("====================================================");
		System.out.println("34. int 배열을 전달받아 Person 배열로 변환하라(각 age만 채우기).");
		for(Person p : person.intPersonArrConvert(intArr)) {			
			person.printPerson(p);
		}
		System.out.println("====================================================");
		
//		35. Person 객체를 복사(clone 비슷하게)해 새로운 Person을 리턴하는 메서드를 작성하라.
		
		System.out.println("====================================================");
		System.out.println("35. Person 객체를 복사(clone 비슷하게)해 새로운 Person을 리턴하는 메서드를 작성하라.");
		person.printPerson(person.copyPerson(personSample));
		System.out.println("====================================================");
		
//		36. Person 배열을 전달받아 깊은 복사(deep copy)를 수행해 새 배열을 리턴하라.
		
		System.out.println("====================================================");
		System.out.println("36. Person 배열을 전달받아 깊은 복사(deep copy)를 수행해 새 배열을 리턴하라.");
		for(Person p : person.deepCopyPerson(personArr31)) {
			person.printPerson(p);
		}
		System.out.println("====================================================");
		
		
//		37. Person 배열을 전달받아 이름이 null인 사람만 출력하라.
		
		System.out.println("====================================================");
		System.out.println("37. Person 배열을 전달받아 이름이 null인 사람만 출력하라.");
		Person[] personArr37 = new Person[5];
		personArr37[0] = new Person(37);
		personArr37[1] = new Person("사람1",32);
		personArr37[2] = new Person("사람2",32);
		personArr37[3] = new Person(38);
		personArr37[4] = new Person(39);
		person.nullNamePrint(personArr37);
		System.out.println("====================================================");
		
//		38. Person 배열과 배열 길이를 전달받아 새 배열을 만들고 기존 내용을 복사해라.
		
		System.out.println("====================================================");
		System.out.println("38. Person 배열과 배열 길이를 전달받아 새 배열을 만들고 기존 내용을 복사해라.");
		for(Person p : person.copyPersonArrlength(person.personArr(5), 5)) {
			person.printPerson(p);
		}
		System.out.println("====================================================");

//		39. Person 객체를 전달받아 내부 값을 전부 초기화하는 메서드를 작성하라.
		
		System.out.println("====================================================");
		System.out.println("39. Person 객체를 전달받아 내부 값을 전부 초기화하는 메서드를 작성하라.");
		person.printPerson(personSample);
		person.resetPerson(personSample);
		person.printPerson(personSample);
		System.out.println("====================================================");
		
//		40. int 값 하나와 Person 하나를 전달받아 두 값을 비교 출력하는 메서드를 만들라.

		System.out.println("====================================================");
		System.out.println("40. int 값 하나와 Person 하나를 전달받아 두 값을 비교 출력하는 메서드를 만들라.");
		for(Person p : person.personArr(5)) {
			person.comparePersonInt(p, 30);
		}
		System.out.println("====================================================");
		
//		🔹 5단계: 복잡한 객체 리턴/전달 패턴 연습 (41~45)
//		41. Person 객체를 여러 개 생성해 배열에 담아 리턴하는 메서드 만들기.
		
		System.out.println("====================================================");
		System.out.println("41. Person 객체를 여러 개 생성해 배열에 담아 리턴하는 메서드 만들기.");
		for(Person p : person.personArr(5)) {
			person.printPerson(p);
		}
		System.out.println("====================================================");
		
//		42. Person 배열을 전달해 모든 사람의 hello()를 호출하는 메서드 작성하기.
		
		System.out.println("====================================================");
		System.out.println("42. Person 배열을 전달해 모든 사람의 hello()를 호출하는 메서드 작성하기.");
		person.personHello(person.personArr(5));
		System.out.println("====================================================");
		
//		43. Person과 Person 배열을 동시에 매개변수로 받아 특정 위치에 저장하는 메서드 작성하기.
		
		System.out.println("====================================================");
		System.out.println("43. Person과 Person 배열을 동시에 매개변수로 받아 특정 위치에 저장하는 메서드 작성하기.");
		for(Person p : persons) {
			person.printPerson(p);
		}
		System.out.println("저장 후");
		for(Person p : person.personSavePersonArr(leejihoon, persons)) {
			person.printPerson(p);
		}
		System.out.println("====================================================");
		
//		44. Person 배열을 전달받아 age 기준으로 정렬한 뒤 새 배열로 리턴하기.
		System.out.println("====================================================");
		System.out.println("44. Person 배열을 전달받아 age 기준으로 정렬한 뒤 새 배열로 리턴하기.");
		for(Person p :person.personArrSortArr(person.personArr(50))) {
			person.printPerson(p);
		}
		System.out.println("====================================================");
		
//		45. Person을 전달받아 내부 필드를 수정한 뒤, 수정 결과를 main에서 확인하는 실험을 해보라.
		System.out.println("====================================================");
		System.out.println("45. Person을 전달받아 내부 필드를 수정한 뒤, 수정 결과를 main에서 확인하는 실험을 해보라.");
		System.out.print("수정 전 = ");
		person.printPerson(leejihoon);
		person.modifyPerson(leejihoon);
		System.out.print("수정 후 = ");
		person.printPerson(leejihoon);
		System.out.println("====================================================");
	}

}


