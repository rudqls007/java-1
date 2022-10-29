package kr.co.ezenac.operator02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	Scanner 클래스 : 입력을 받기 위한 클래스이다
		 * 사용하고나서 반드시 닫아줘야 한다
		 */
			Scanner scan = new Scanner(System.in);
			
			//System.out.println(" 숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");
			
			
			// 입력 대기 
			
			
			// 입력이 끝나고나서 엔터 값이 들어오면 변수에 저장한다
			
			/*
			 * 여러 숫자가 입력되면 일단 버퍼(buffer) 내용을 넣고 스페이스(공백) 구분하여
			 * 하나씩 입력된 데이터 변수에 대입하게 된다 
			 */
			System.out.println(" 숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");
			//System.out.println(" 숫자를 1 입력하고 엔터를 입력하세요.");
			int num1 = scan.nextInt();
			//System.out.println(" 숫자를 2 입력하고 엔터를 입력하세요.");
			int num2 = scan.nextInt();
			//System.out.println(" 숫자를 3 입력하고 엔터를 입력하세요.");
			int num3 = scan.nextInt();
			
			// 하나씩 입려고딘 데이터를 변수에 대입하게 된다
			System.out.println(" 숫자를 1 입력하고 엔터를 입력하세요.");
			int num4 = scan.nextInt();
			System.out.println(" 숫자를 2 입력하고 엔터를 입력하세요.");
			int num5 = scan.nextInt();
			System.out.println(" 숫자를 3 입력하고 엔터를 입력하세요.");
			int num6 = scan.nextInt();
			
			System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
			
			//System.out.println(" num1 = "  + num1);
			//System.out.println(" num2 = "  + num2);
			//System.out.println(" num3 = "  + num3);
			scan.close();
	}

}
