package kr.co.ezenac.member;
/*
 * 1. 클래스는 대문자로 시작함
 * 2. java 파일 하나에 여러 개가 있을 수 있다
 *	- public 클래스는 하나다
 *	- public 클래스와 .java 파일의 이름은 동이랗다
 */

public class Student {
public Student() {    // 이 기본 생성자가 class 안에 기본적으로 생략 되어 있다
	// TODO Auto-generated constructor stub
}
	// private 접근지정자
	public int studentId;
	public String studentName;
	public String address; 
	
	public void showStudentInfo() {
		System.out.println(studentName +" , "+  address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
