package kr.co.ezenac.decsion03;

//문자열이 지원되는 switch - case 문이다

public class SwithCaseTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String medal = "Gold";
		
		switch (medal) {
		case "Gold":
			System.out.println(" 금메달입니다 ");
			break;
		case "Silver":
			System.out.println(" 은메달입니다 ");
			break;
		case "Bronze":
			System.out.println(" 동메달입니다 ");
		default:
			System.out.println(" 메달이 없습니다 ");
			break;
		}
		
	}

}
