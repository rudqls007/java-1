package kr.co.ezenac.loop02;
/*
 *  구구단을 출력합니다.
 *  몇 단부터 출력할까요? : ( 입력  3 )
 *  끝 단은 얼마인가요? : 
 */
import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println( " 구구단을 출력합니다  ");
		System.out.println(" 몇 단부터  출력할까요? :");
		int input = scan.nextInt();
		System.out.println(" 끝 단은 얼마인가요? :");
		int output = scan.nextInt();
		
	
		
		for(int i = input; input<=output; input++)  {
			System.out.println(" ==== " + input + " 단 ====");
		
			for(int j = 1; j<10; j++) {
				System.out.println( input + " * " + j + " = " + (input * j ) );	
			}
		}
		scan.close();
		
		
		}
			
	
}
