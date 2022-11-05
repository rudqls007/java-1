package kr.co.ezenac.templateMethod;

public abstract class Car {
	final public void run() {
		StartCar();
		drive();
		stop();
		turnOff();
	}

	public  void turnOff() {
		System.out.println("시동을 끈다.");
	}

	public abstract void stop();

	public abstract void drive();

	public void StartCar() {
		System.out.println(" 시동을 켠다.");
	}
}
