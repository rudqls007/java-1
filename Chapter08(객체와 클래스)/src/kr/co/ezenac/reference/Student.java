package kr.co.ezenac.reference;

public class Student {
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;		// korea, math = 참조변수
	
	public Student(int id, String name) {
		studentId = id;		// 맴버변수를 매개변수로 초기화한다
		studentName = name;
		
		korea = new Subject();
		math = new Subject();		// 오버로딩을 위한 초기화하고 객체를 생성
	}
	
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		//참조변수 // 맴버  = // 매개변수
		korea.score = score;
	}
	public void setMathSubeject(String name, int score) {
		math.subjectName = name;
		math.score =score;
				
}
	public void showStudentScore(){
		int total = math.score + korea.score;
		System.out.println(studentName + " 학생의 총점은" + total + " 점 입니다");
		}
}
