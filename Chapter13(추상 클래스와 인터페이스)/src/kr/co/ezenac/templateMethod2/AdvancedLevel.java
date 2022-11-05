package kr.co.ezenac.templateMethod2;

public class AdvancedLevel extends PlayerLevel {
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	public void jump() {
		System.out.println("jump 합니다");
		
	}

	public void turn() {
		System.out.println(" turn 못 합니다");
	}

	public void showLevelMessage() {
		System.out.println("****중급자 레벨입니다*****");
	}
}
