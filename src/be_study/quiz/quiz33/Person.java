package be_study.quiz.quiz33;

import java.util.ArrayList;

class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {		
		this.name = name;
	}

	public Person(int age) {		
		this.age = age;
	}
	
	void hello() {
		System.out.println( name + " : Hello!");
	}
	
	public void nameOutput(Person person) {
		System.out.println("====================================================");
		System.out.println("13. Person 객체를 매개변수로 받아 name을 출력하는 메서드를 만들어라." + " name : " + person.name);
		System.out.println("====================================================");
	}
	
	public Person setPerson() {
		Person person = new Person("이상준", 27);
		return person;
	}
	
	public void printPerson(Person person) {
		System.out.println( "name : " + person.name + " age : "	+ person.age);
	}
	
	public void ageUpper(Person p1, Person p2) {
		if(p1.age > p2.age) {
			printPerson(p1);
		}else if(p1.age == p2.age) {
			System.out.println("둘의 나이가 같습니다.");
		}else {
			printPerson(p2);
		}
	}
	
	public void agePlus(Person person) {
		
		person.age++;
		
	}
	
	public void personHello(Person[] persons) {
		for(Person s : persons) {
			s.hello();
		}
	}
	
	public Person maxAge(Person[] persons) {
		int indexCount = 0;
		int maxAge = persons[0].age;
		for(Person s : persons) {
			if(s.age > maxAge) {
				indexCount++;
				maxAge = s.age;
			}
		}
		Person person = persons[indexCount];
		
		return person;
	}
	
	public Person[] personArr(int length) {
		Person[] persons = new Person[length];
		for(int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			persons[i].name = "RandomName" + i;
			persons[i].age = (int)(Math.random() * 65) + 1;
		}
		
		return persons;
	}
	
	public int totalAge(Person[] persons){
		int ageTotal = 0;
		for(Person s : persons) {
			ageTotal += s.age;
		}
		return ageTotal;
	}
	
	public void all10Age(Person[] persons){
		for(Person s : persons) {
			s.age = 10;
		}
	}
	
	public String[] allName(Person[] persons) {
		String[] names = new String[persons.length];
		for(int i = 0; i < persons.length; i++) {
			names[i] = persons[i].name;
		}
		return names;
	}
	
	public Person nameSearch(Person[] persons,String name) {
		Person person = new Person();
		for(Person s : persons) {
			if(s != null) {
				if(name.equals(s.name)) {
					person = s;
				}
			}
		}
		return person;
	}
	
	public Person newPersonName(Person person) {
		Person newPerson = new Person(person.name);
		return newPerson;
	}
	
	public ArrayList<Person> age30Persons(Person[] persons) {
		ArrayList<Person> age30PersonArr = new ArrayList<Person>();
		for(Person p : persons) {
			if(p.age >= 30) {
				age30PersonArr.add(p);
			}
		}
		return age30PersonArr;
	}
	
	public void intArrOutput(int[] intArr){
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] +" ");
		}
		System.out.println();
	}
	
	public void personArrOutput(Person[] personArr){
		for(int i = 0; i < personArr.length; i++) {
			printPerson(personArr[i]);
		}
	}
	
	public void personPlusInt(Person[] personArr, int[] intArr) {
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] +"번. ");
			printPerson(personArr[i]);
		}
	}
	
	public int[] ageIntArrConvert(Person[] personArr) {
		int[] ageArr = new int[personArr.length];
		for(int i = 0; i < personArr.length; i++) {
			ageArr[i] = personArr[i].age;
		}
		return ageArr;
	}
	
	public Person[] intPersonArrConvert(int[] intArr) {
		Person[] personArr = new Person[intArr.length];
		for(int i = 0; i < intArr.length; i++) {
			personArr[i] = new Person(intArr[i]);
		}
		return personArr;
	}
	
	public Person copyPerson(Person person) {
		Person copyPerson = new Person(person.name, person.age);
		return copyPerson;
	}
	
	public Person[] deepCopyPerson(Person[] personArr) {
		Person[] copyPersonArr = new Person[personArr.length];
		for(int i = 0; i < personArr.length; i++) {
			copyPersonArr[i] = copyPerson(personArr[i]);
		}
		return copyPersonArr;
	}
	
	public void nullNamePrint(Person[] personArr) {
		for(Person p : personArr) {
			if(p.name == null) {
				printPerson(p);
			}
		}
	}
	
	public Person[] copyPersonArrlength(Person[] personArr, int length) {
		Person[] copyPersonArr = new Person[length];
		copyPersonArr = deepCopyPerson(personArr);
		return copyPersonArr;
	}
	
	public void resetPerson(Person person) {
		person.age = 0;
		person.name = null;
	}
	
	public void comparePersonInt (Person person, int integer) {
		if(person.age < integer) {
			System.out.println("나이 ("+ person.age +") 가 숫자 ("+ integer +") 보다 작습니다.");
		}else if(person.age == integer) {
			System.out.println("나이 ("+ person.age +") 와 숫자 ("+ integer +") 가 같습니다.");
		}else {
			System.out.println("나이 ("+ person.age +") 가 숫자 ("+ integer +") 보다 큽니다.");
		}
	}
	
	public Person[] personSavePersonArr(Person person, Person[] personArr) {
		personArr[personArr.length - 1] = person;
		return personArr;
	}
	
	public Person[] personArrSortArr(Person[] personArr) {
		Person[] sortPersonArr = new Person[personArr.length];
		
		int[] tempArr = new int[personArr.length];
		
		for(int i = 0; i < personArr.length; i++) {
			for(int j = 0; j < personArr.length; j++) {
				if(personArr[i].age < personArr[j].age||(personArr[i].age == personArr[j].age && i < j)) {
					tempArr[i]++;
				}
			}
		}
		for(int i = 0; i < tempArr.length; i++) {
			sortPersonArr[tempArr[i]] = personArr[i];
		}
		return sortPersonArr;
	}
	
	public void modifyPerson(Person person) {
		person.age = 999;
		person.name = "수정했습니다.";
	}
}

