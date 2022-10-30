package kr.co.ezenac.Constructor02;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		
		//System.out.println(student.getName());
		//System.out.println(student.getage());
		System.out.println(student.toString()); //주소 값을 리턴을 하게끔 정의가 돼 있다
		
		
		System.out.println();
		
		//매개변수가 있는 생성자 호출
		
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);
		
		System.out.println();
		Student student3 = new Student("신사임당");
		
		System.out.println(student3);
		
		System.out.println();
		
		//매개변수 int형 하나 있는 생성자 호출
		Student student4 = new Student(23);
		System.out.println(student4);
		
		
	}

}
