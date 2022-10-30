package kr.co.ezenac.Constructor03;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();		//기본형 차 주문
		
		System.out.println(car.toString());
		
		Car car2 = new Car("흰색", "오토", 5);
		
		System.out.println(car2);
		
	}

}
