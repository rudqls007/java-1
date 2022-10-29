package kr.co.ezenac.decsion02;

import java.util.Scanner;

public class IfElseNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" 점수를 입력하세요: ");
		
		int score = scan.nextInt();
		
		
		// score 변수의 값에 따라서 조건문 분기가 일어나야한다
		
		if (score >= 90) {
			//중첩 if문 (무제한적으로 중첩 if문은 들어갈 수 있다 
			//(대신 가독성이 떨어진다 - - 보통 2개를 초과하지 않도록 하는 게 좋다))
			if (score >= 95) {
				System.out.println(" 당신은 A+ 등급입니다");
			} else {
				System.out.println(" 당신은 A0 등급입니다");
			}
		}
		else if (score >= 80) {
			if (score >=85) {
				System.out.println(" 당신은 B+ 등급입니다");
			} else {
				System.out.println(" 당신은 B0 등급입니다");
			}
		
				
			}
		
		else {
			
			System.out.println(" 더욱 분발해주세요");
		}
		scan.close();
		
	}

}
