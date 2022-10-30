package kr.co.ezenac.Constructor02;

public class Student {
	
	private String name;
	private int age;

	
	public Student() {
		System.out.println(" 기본 생성자 호출");
		
	}
	
	public Student(int age){
		System.out.println(" 매개변수가 int만 있는 생성자 호출");
		this.age = age;
	}
	
	public Student(String name) {
		System.out.println(" 매개변수가 String만 있는 생성자 호출");
		 this.name = name;
	}
	//매개 변수가 있는 생성자 = 오버로딩이 됐다  매개 변수 = String name, int age
	public Student(String name, int age) {
		System.out.println(" 매개 변수가 있는 생성자 호출");
		//super();
		this.name = name;
		this.age = age;
	
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.getName() + " ," + this.getage();
}

	public String getName() {
		return name;
	}

	public int getage() {
		return age;
	}
	

	
	
}




