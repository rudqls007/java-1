package kr.co.ezenac.templateMethod1;

public class AdvancedLevel extends Player{

	@Override
	public void run() {
		System.out.println("빨리 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다");
		System.out.println("높이 점프합니다");
	}

	@Override
	public void turn() {
		System.out.println("turn 못 합니다");
	}

}
