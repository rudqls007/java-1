package kr.co.ezenac.decsion02;

import java.util.Scanner;

/*
 *  if~else if 문
 *  	- 하나의 조건이 만족되면 나머지 else if 부분은 수행하지 않는다
 *  if 문
 *  	- 각각 다른 조건문으로 해석이되어 각각 수행하게 된다
 */
public class IfIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 나이를 입력하세요 : ");
		
		int age = scan.nextInt();
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println(" 미취학 아동입니다");
			
		}
		if (age < 14) {
			charge = 2000;
			System.out.println(" 초등학생입니다");
			
		}
		if (age < 20) {
			charge = 2500;
			System.out.println(" 중, 고등학생입니다");
			
		}
		else {
			charge = 3000;
			System.out.println(" 일반인입니다");
		}
		
		System.out.println(" 입장료는 " + charge + " 원 입니다");
		scan.close();
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print(" 나이를 입력하세요 : ");
//		
//		int age = scan.nextInt();
//		
//		if ( age < 8 ) {
//			System.out.println(" 미취학 아동입니다 ");
//			System.out.println(" 입장료는 1000원입니다");
//		
//		}
//		
//		else if ( age < 14) {
//			System.out.println(" 초등학생입니다 ");
//			System.out.println(" 입장료는 2000원입니다");
//			
//		}
//		else if ( age < 20) {
//			System.out.println(" 중, 고등학생입니다 ");
//			System.out.println(" 입장료는 2500원입니다");
//			
//		}
//		else  {
//			System.out.println(" 일반인입니다 ");
//			System.out.println(" 입장료는 3000원입니다");
//			
//		}
//		
//		scan.close();
//	
		}
}
