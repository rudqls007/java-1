package kr.co.ezenac.field02;

public class FieldInitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * new 연산자
		 *	- 클래스에 있는 맴버들의 바이트 크기만큼
		 * 		heap에다가 메모리 할당을 하며 동시에 초기화를 시켜주는 역할을 한다	
		 */
		FieldInit fieldInit = new FieldInit(); // 호출하기 위한 객체를 만든다
		System.out.println(fieldInit.byteField);
		System.out.println(fieldInit.booleanField);
		System.out.println(fieldInit.floatField);
		
		System.out.println(fieldInit);
		
	}
	
		
}
