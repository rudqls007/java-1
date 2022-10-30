package kr.co.ezenac.goingtoschooloop;

public class Goingtoschool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("이순신 ", 10000);
		Student student2 = new Student("신사임당", 50000);			// 객체 student, student2  두 개를 만들었다
		
		Bus bus100 = new Bus(100);		// 100번 버스의 생성자를 만듦
		Subway subway9 = new Subway(9); 	// 9번 지하철의 생성자를 만듦
		
		student.takeBus(bus100);
		student2.takeSubway(subway9);
		
		student.showInfo();
		student2.showInfo();				//showInfo의 메소드를 보여준다
		
		bus100.showInfo();
		subway9.showInfo();					// 객체 간의 커뮤니케이션이 가능하다
		
	}

}
