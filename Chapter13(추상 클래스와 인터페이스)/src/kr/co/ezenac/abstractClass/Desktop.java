package kr.co.ezenac.abstractClass;

public class Desktop extends Computer {

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop display");
		
	}

	@Override
	void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing");
	}
	@Override
	public void turnOff() {
		System.out.println("DeskTop turnOff");
	
	}
	@Override
	public void turnOn() {
		System.out.println("DeskTop turnOn");
	}

}
