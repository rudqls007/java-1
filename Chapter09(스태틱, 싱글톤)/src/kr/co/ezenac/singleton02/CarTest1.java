package kr.co.ezenac.singleton02;

public class CarTest1 {
	public static void main(String[] args) {
		
		CarF1 carF1 = CarF1.getInstance();
		Car bmwi4 = carF1.createCar();
		Car bmwix = carF1.createCar();
		
		System.out.println(bmwi4.getCarNum());
		System.out.println(bmwix.getCarNum());
	}
}
