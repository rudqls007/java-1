package kr.co.ezenac.loop05;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {			// while문의 true는 조건이 없을 때 값이 만족하므로 무한루프이다.
			
			showMenu();			// 밑에 showmenu의 지정된 코드 값을 가져와서 출력함
			char myChar = scan.next().charAt(0) ;			// next(); = 공백까지만 받는다  char MyChar 라는 문자 값에 지정함
				// charAt(); = string타입은 문자열을 char타입 문자로 변환해주는 명령어, 	
               //	charAt()은 string타입의 문자열에서 해당 위치에 있는 문자만을 char 타입으로 변환해 사용힐 수 있게 만들어준다
			 //	()안의 0은 문자열의 위츠를 가리키고 string 문자열의 0번째 문자를 char타입으로 변환해주는 메소드이다
			if(!checkNum(myChar)) {
				System.out.println(" 메뉴를 잘못 선택했습니다. ");
				continue; // 다시 입력을 받는다
			}
			int num = myChar - '0'; 
			/*
			 *  						' 1 ' 	-  ' 0 ' 문자 0은 정수 48
			 *  문자 아스키 코드	49    -   48  = 1
			 */
			System.out.println(num);
			if(num == 0) {
				break;			// if문의 num 값이 0 되면 멈추게 하는 조건문을 만들고 그 값이 충족하면 프로그램을 멈추는 break 메소드를 출력 그리고 while문이 멈춤
			}
			else {
				if( num > 4) {		// 변수 num 값이 4보다 크다는 비교연산자를 저장
					System.out.println(" 메뉴를 잘못 선택하셨습니다"); 
					continue;		//  num 값이 4보다 크다면 위에 출력 내용과 포함 처음부터 다시 시작하는 continue; 메소드를 입력함
				}
				// 사칙연산 실행
				System.out.print("첫 번째 숫자 : ");  //  첫번째 숫자를 출력하는 코드
				int num1 = scan.nextInt();
				System.out.print("두 번째 숫자 : ");		// 두번째   숫자를 출력하는 코드
				int num2 = scan.nextInt();
				
				if( num == 1) {
					addNum(num1, num2);
				}
				else if( num ==2) {
					addNum1(num1, num2);
				}
				else if( num == 3)
					addNum2(num1, num2);
				else if( num == 4)
					addNum3(num1, num2);
				else if( num == 5) {
					
				}
				
			}
		}
		System.out.println(" 계산기를 종료합니다");
		
			scan.close();
	}
	
	public static void addNum3(int x, int y) {					// addnum이라는 파라미터
		int result = x / y;
		System.out.println(x + " / " + y + " = "  + result);
		
	}

	public static void addNum2(int x, int y) {
		int result = x * y;
		System.out.println(x + " * " + y + " = "  + result);
		
		
	}

	public static void addNum1(int x, int y) {
		int result = x - y;
		System.out.println(x + " - " + y + " = "  + result);
		
	}

	public static void addNum(int x, int y) {
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result );
		
	}

	public static boolean checkNum(char ch) {//값이 복사가 됐다 call by value {
		 
	if (ch >= '0' && ch <= '9') {
		return true;
	}
		
	else {
		return false;
	}
		
}

	public static void showMenu() { // showMenu();의 메소드 메뉴를 출력하기 위한 코드 값
				System.out.println(" 메뉴를 선택하세요 ");	
				System.out.println(" 1. 더하기 ");	
				System.out.println(" 2. 빼기 ");	
				System.out.println(" 3. 곱하기 ");	
				System.out.println(" 4. 나누기 ");	
				System.out.println(" 0. 끝내기 ");	
		
	}

}
