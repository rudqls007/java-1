package kr.co.ezenac.global;

import java.util.Random;

public class BeforeMain {

	static int num;	// 맴버 변수 ( 스태틱 변수 )
	
	static {		// static 초기화 블록
		Random random =new Random(); // 객체 생성, 기본 생성자로 초기화
		num = random.nextInt(100); //  매개 변수에 100의 값을 주고,  main() 실행 전에 0~99 사이에 임의의 숫자를 반환 시킨다
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(num);
	}
}
