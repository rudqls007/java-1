package kr.co.ezenac.loop05;

import java.util.Scanner;

/*
 * 
 * 메세지를 입력하세요
 * 프로그램을 종료하려면, q를 입력하세요.
 *  >이젠
 *  
 *  입력받은 메세지 : 이젠
 *  >q 
 *  입력받은 메세지 : q
 *  프로그램을 종려합니다.
 */
public class DoWhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println( " 메세지를 입력하세요. ");
		System.out.println( " 프로그램을 종료하려면, q를 입력하세요, ");
		
		
		String str = null;			// 문자열에 null 값을 저장
		
		do {
			System.out.println(">"); 			// >를 출력하는 코드 값
			str = scan.nextLine();					// 계속해서 출력하기 위한 코드 값  nextLine();
		} while(!str.equals("q"));		//  " = " 의 비교를 위한 연산자가 필요하고 " equals() " 메소드는 객체 문자열끼리 비교를할 수 있게 해준다 문자열 str 값이 문자 q와 같다면 프로그램을 종료하는 코드를 선언한다
			System.out.println(" 프로그램을 종료합니다 ");	// 문자열 str 값과 문자 q 값이 서로 같으므로 31번 코드라인에서 콘솔이 종료된다.
		scan.close();
	
			 	}
}
