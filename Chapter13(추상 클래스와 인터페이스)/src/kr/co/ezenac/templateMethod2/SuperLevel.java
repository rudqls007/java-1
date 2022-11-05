package kr.co.ezenac.templateMethod2;

public class SuperLevel extends PlayerLevel {
	public void run() {
		System.out.println("아주 빨리 달립니다.");
	}

	public void jump() {
		System.out.println("아주 높이 jump  합니다");

	}

	public void turn() {
		System.out.println(" turn 합니다");
	}

	public void showLevelMessage() {
		System.out.println("****고급자 레벨입니다*****");
	}
}
