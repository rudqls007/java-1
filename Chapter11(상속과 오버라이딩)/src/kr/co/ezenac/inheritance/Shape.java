package kr.co.ezenac.inheritance;

//조상 클래스
public class Shape {
	String color = "black";
	
	
	public Shape() { 
		System.out.println(" shape 클래스의 기본 생성자");
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		System.out.println("draw()");
	}
}
