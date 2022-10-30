package kr.co.ezenac.reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student(100, "이순신"); // student 를 호출함으로써 student 클래스에 있는 id, score가 초기화가 됐다
		student.setMathSubeject("수학", 100);
		student.setKoreaSubject("국어", 80);
		
		student.showStudentScore();  // Student의 총 합을 보여주는 show
		
		
		
		Student student2 = new Student(200,"신사임당");
		
		student2.setKoreaSubject("국어", 100);
		student2.setMathSubeject("수학", 100);
		
		student2.showStudentScore();
		

		
		
	}

}
