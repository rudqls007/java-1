package kr.co.ezenac.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(); // 기본 생성자로 초기화 값
		circle.draw();
		System.out.println();
		 
		Circle circle2 = new Circle(new Point(150, 150), 500);
		circle2.draw();
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		
		Triangle triangle2 = new Triangle(new Point(10, 10), new Point(20, 20), new Point(30, 30));
		triangle2.draw();
		
		Point[] points = new Point[] { new Point(10,10), new Point(10,10), new Point(10,10)};
		Triangle triangle3 = new Triangle(points);
		triangle3.draw();
	}
	}
