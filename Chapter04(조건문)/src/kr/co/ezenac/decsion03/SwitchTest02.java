package kr.co.ezenac.decsion03;

public class SwitchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4;
		
		switch (num % 3) {
		case 1 :
			System.out.println(" 나머지가 1");
			break;
		case 2 :
			System.out.println(" 나머지가 2");
			break;
		default:
			System.out.println(" 나머지가 0");
		}
	}

}
