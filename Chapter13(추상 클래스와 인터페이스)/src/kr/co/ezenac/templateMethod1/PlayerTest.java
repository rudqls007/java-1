package kr.co.ezenac.templateMethod1;

public class PlayerTest {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {
			int level = i;
			if (i == 1) {
				System.out.println("BeginerLevel의 레벨은 " + level + " 입니다.");
				Player BPlayer = new BeginerLevel();
				BPlayer.go(level);
			} else if (i == 2) {
				System.out.println("AdvancedLevel의 레벨은 " + level + " 입니다.");
				Player APlayer = new AdvancedLevel();
				APlayer.go(level);
			} else if (i == 3) {
				System.out.println("SuperdLevel의 레벨은 " + level + " 입니다.");
				Player SPlayer = new SuperLevel();
				SPlayer.go(level);
			} else {
				
				
			}

		}
	}
}
