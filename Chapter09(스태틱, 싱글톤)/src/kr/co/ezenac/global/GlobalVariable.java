package kr.co.ezenac.global;

class Cat {
	static int global = 5;  //  static이 붙어서 정적(static) 변수가 된다
	int num = 3;			// 인스턴수 변수
	
	public void printValue(int num) {
		this.num = num;
		System.out.println(" num = " + this.num);
		System.out.println(" global = " + Cat.global);	// 클래스.변수로도 호출한다
	}
	
}


public class GlobalVariable {

	
	
	public static void main(String[] args) {		// 프로그램의 시작 시점
		int num1 = 5;
		int num2 = 2;			// 지역 변수들
		System.out.println(num1 + "," + num2);
		
		System.out.println();
		
		Cat cat1 = new Cat(); //	지역 변수(참조 변수) > 스택 영역에 생성이 됨
		cat1.num =1;			// 인스턴스 변수는 값을 항상 초기화 가능하다
		Cat.global = 10;		// 스태틱 변수에 직접 접근
		
		cat1.printValue(20);  // int num 인스턴스 메서드 호출
		System.out.println(cat1.num);
		System.out.println(cat1.global);
		System.out.println(Cat.global);
		
		System.out.println();
		
		Cat cat2 = new Cat();
		cat2.num = 2;
		Cat.global = 11;
		cat2.printValue(10);
		System.out.println(cat2.num);
		System.out.println(cat2.global);
		System.out.println(Cat.global);
		
		
		
 	}
}
