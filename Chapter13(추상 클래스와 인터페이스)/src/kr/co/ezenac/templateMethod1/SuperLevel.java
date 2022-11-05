package kr.co.ezenac.templateMethod1;

public class SuperLevel extends Player {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프합니다");
		System.out.println("아주 높이 점프합니다");
		System.out.println("아주 높이 점프합니다");
	}

	@Override
	public void turn() {
		System.out.println("턴 합니다");
	}

}
