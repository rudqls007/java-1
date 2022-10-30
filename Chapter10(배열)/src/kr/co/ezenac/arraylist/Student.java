package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectlist;

	public Student(int studentId, String studentName) {
//		super();
		this.studentId = studentId;
		this.studentName = studentName;

		subjectlist = new ArrayList<>(); // 초기화
	}

	public void addsubject(String name, int score) {
		Subject subject = new Subject();

		subject.setName(name);
		subject.setScorePoint(score);
		subjectlist.add(subject);
	}

	public void showInfo() {
		int total = 0; // 총점을 구할 로컬 변수를 구현한다

		for (Subject subject : subjectlist) {
			total += subject.getScorePoint();
			System.out.println(" 학생 " + this.studentName + "의" + subject.getName() + " 과목 성적은" + subject.getScorePoint());

		}
			System.out.println(" 학생 " + this.studentName + " 의 총점은" + total);
	}
}
