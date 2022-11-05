package kr.co.ezenac.templateMethod2;

public class BeginerLevel extends PlayerLevel{

	public void run() {
		System.out.println("천천히 달립니다.");
	}

	public void jump() {
		System.out.println("jump 못 합니다");
	}

	public void turn() {
		System.out.println("turn 못 합니다");
	}

	public void showLevelMessage() {
		System.out.println("****초급자 레벨입니다*****");
	}

}
