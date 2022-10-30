package kr.co.ezenac.singleton02;

public class CarF1 {

	private static CarF1 instance = new CarF1();
	
	private CarF1() {
		
	}
	 public static CarF1 getInstance() {
		if(instance == null) {
			instance = new CarF1();
			
			
		}
		return instance;
	 }
	public Car createCar() {
		Car car = new Car();
		
		return car;
	}
}
