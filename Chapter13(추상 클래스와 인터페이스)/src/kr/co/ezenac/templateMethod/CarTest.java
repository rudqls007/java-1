package kr.co.ezenac.templateMethod;

public class CarTest {
	public static void main(String[] args) {
		Car dlCar = new DeepLCar();
		dlCar.run();
		System.out.println();
		
		Car manualCar = new ManualCar();
		manualCar.run();
		}
}
