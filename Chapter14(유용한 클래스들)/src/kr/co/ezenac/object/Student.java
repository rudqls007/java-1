package kr.co.ezenac.object;

public class Student implements Cloneable { // implements Cloneable = 이 클래스를 복제를 허용하겠다
	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
//		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj; // 다운 캐스팅
			if (this.studentId == stu.studentId)
				return true;
			else
				return false;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return studentId;

	}
@Override
protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
