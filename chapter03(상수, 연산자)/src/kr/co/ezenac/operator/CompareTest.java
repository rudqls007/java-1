package kr.co.ezenac.operator;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교 연산자 논리형 boolean 을 사용한다
		
		
		int num1 = 5;
		int num2 = 3;
		
		
		boolean value = (num1 > num2);
		System.out.println(value);
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		System.out.println(" 1.0  == 1 : " + (1.0 == 1));  // 소수보다 더 큰 실수형으로 자동 형 변환이 이루어지고 다음 비교 연산했다
		System.out.println(" 1.0  == 1 : " + (1.0 != 1));
	}

}
