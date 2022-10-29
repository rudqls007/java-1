package kr.co.ezenac.decsion;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int num = 100;
		
		if (num > 50) {
			System.out.println(" num 변수의 값이 50보다 크다");
			
		}
		
		// 한 줄만 실행하면 중괄호 생략 가능하다 멀티라인은 중괄호를 사용해야 한다
		if (num > 60) 
			System.out.println(" num 변수의 값이 60보다 크다");
		
		//같은 줄에 작성 가능. 실행 문장의 끝은 세미콜론으로 구분한다
		if (num > 70) System.out.println(" num 변수의 값이 70보다 크다");
		
		if (num <50) 
			System.out.println(num);
			System.out.println(" num 변수 값이 50보다 작습니다 ");
			
		
	}
	

}
