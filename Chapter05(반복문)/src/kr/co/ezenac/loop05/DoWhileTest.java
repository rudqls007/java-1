package kr.co.ezenac.loop05;

import java.util.Scanner;

// 입력받은 모든 숫자의 합을 출력하는 프로그램을 작성하시오 단, 0을 입력하면 반복을 그만하세요
public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" 정수를 입력하세요 : ");
		int sum = 0;
		int input;
		
		
		do {
				input = scan.nextInt();
				sum+= input;
		}
				 while(input != 0);
			System.out.println(" sum "  + sum);
			
		
				scan.close();
	

	
			}
		
}
