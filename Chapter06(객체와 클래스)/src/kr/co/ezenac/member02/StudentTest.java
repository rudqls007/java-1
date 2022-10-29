package kr.co.ezenac.member02;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(202208, "이순신", 3);
		
		String result = student.showStudentInfo();
		System.out.println(result);
		
		
	}

}
