package kr.co.ezenac.decsion03;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 95;
		
		//조건 : int 이하의 정수 값 ( 실수 x), String 값이 들어온다
		switch(score) {
			case 95 :
					System.out.println("95점입니다");
					//break;
			case 94 :
					System.out.println("94점입니다");
					//break;
			case 93 :
					System.out.println("93점입니다");
					//break;
			default :
					System.out.println("잘못된 값입니다");
			
		}
		
	}

}
