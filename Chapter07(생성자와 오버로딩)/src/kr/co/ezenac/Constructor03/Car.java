package kr.co.ezenac.Constructor03;

public class Car {

	String color;
	String gearType;        //맴버 변수
	int door;
	
	/*
	 * 	this
	 * 	- 참조변수와 같은 역할을 한다
	 * 	- 매개변수와 맴버변수를 구분 짓는데 사용한다
	 * 	(this 사용해서 명확하게 프로그램 실행되도록 한다)
	 */
	public Car( ) {		// 기본 변수는 매개변수가 없다
//		// 직접적으로 인스턴스 맴버변수를 초기화
//		this.color = "노랑";
//		this.gearType = " 수동 ";
//		this.door = 4;
		this("검정", "수동", 2); 	// 내 생성자를 호출하는 this()
		
		
		
		
	}
	
	
	
	
	public Car(String color, String gearType, int door) {  // 매개변수
//		super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color+" ,"+ this.gearType + ", " + this.door; 
	}
	
}
