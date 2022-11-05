package kr.co.ezenac.templateMethod2;
/*
 * 상속이 제한되는 FINAL
 * 1) 변수
 * 	- final 변수는 상수를 의미한다
 * 2) 메서드
 * 	- final 메서드는 하위 클래스에서 오버라이딩을 할 수 없다
 * 3) 클래스
 * 	- final 클래스는 상속을 할 수 없다
 */
public abstract class PlayerLevel {
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) {
		run();

		for (int i = 0; i < count; i++) {
			jump();

		}
		turn();
	}

}
