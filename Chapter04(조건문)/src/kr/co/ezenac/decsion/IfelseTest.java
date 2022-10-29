package kr.co.ezenac.decsion;

import java.util.Scanner;

public class IfelseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		
		int age = scan.nextInt();
		
		
		if ( age >= 8 ) {
			
			System.out.println(" 학교에 다닙니다.");
			
			
		}
		else {
			System.out.println(" 학교에 다니지 않습니다.");
		}
		
		scan.close();
	}

}
