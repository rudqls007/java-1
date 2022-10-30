package kr.co.ezenac.anotherconstructor;

public class Person {
	String name;
	int age;
	
	public Person( ) {
		this("이순신",30);	//this는 무조건 첫 줄에 있어야한다
	}
//오버로딩
	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;											// 초기화 상태
	}
	
	
	public String getName() {			// 
		return name;
	}
	
	public Person getPerson( ) { // Person 타입만 return 가능하다
		return this; // this = Person 자기 자신
		
	}
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
		
		Person person2 = person.getPerson();
		System.out.println(person);				//		주소 값이 서로 같으므로  this 역시 자기 자신을 가리킨다
		System.out.println(person2);			//
		
	}
}
