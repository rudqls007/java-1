package kr.co.ezenac.operator;

public class ArithmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = "+ (num1 + num2) );
		System.out.println("num1 - num2 = "+ (num1 - num2) );
		System.out.println("num1 * num2 = "+ (num1 * num2) );
		System.out.println("num1 / num2 = "+ (num1 / num2) );		// 몫
		System.out.println("num1 % num2 = "+ (num1 % num2) );		// 나머지
		
		
		int result;
		
		try {
		//예외(Exception) 처리 코드
			result = 10 / 0;					// 산술 연산 예외 발생하는 부분
		} catch(ArithmeticException e) {
			System.out.println("예외 발생 : " + e );
		}
		
	}

	}