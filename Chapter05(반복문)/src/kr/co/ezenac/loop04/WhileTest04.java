package kr.co.ezenac.loop04;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int count;
		
//		
//		for(dan =2; dan <=9; dan++) {
//			for(count =1; count<=9; count++) {
//				System.out.println( dan + " * " + count  + " = " +  dan * count);
//			}
//			System.out.println();
//		}
		dan = 2;
		while( dan <= 9){
			count =1;
			while(count <=9) {
				System.out.println(dan + " * " + count  + " = " +  dan * count);
			count++;        // while문 안에 count를 넣는 이유는 곱하기 값의 오른쪽 자리인 변수가 count 9와 같을 때 while 문을 빠져나와 dan 값에 1씩 추가로 올라감 그걸 반복 
			}	
			dan++;		// dan이 9가 되면 이 코드는 출력을 마무리한다
			
			System.out.println();
			}
		}
}
