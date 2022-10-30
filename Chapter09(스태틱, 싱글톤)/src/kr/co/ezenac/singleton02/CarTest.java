package kr.co.ezenac.singleton02;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Car car1 = new Car();
		
		car1.setCarF("1 공장");
		
		Car car2 = new Car();
		
		car2.setCarF("2 공장");
		
		System.out.println(car1.getCarF() + ", " + car1.getCarNum());
		System.out.println(car2.getCarF() + ", " + car2.getCarNum());
		;
	}

}
