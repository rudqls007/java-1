package kr.co.ezenac.templateMethod1;

public abstract class Player {
	 public void go(int level) {
		run();
		jump();
		turn();
		levelUp();
	}

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public void levelUp() {

	}
}
