package kr.co.ezenac.variable03;

public class VarTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 문자 값을 정수 타입으로 바꾸게 되면 아스키코드 값으로 바뀌어서 출력이 된다
		 */
		
		char ch = 'a';
		int i = ch;

	
		System.out.println("문자 > 정수 :" + i);
		
		
		
		//any type + "" > 문자 열 타입으로 캐스팅이 된다
		int i2 = 100;
		String str = "java"+ i2;
		
		System.out.println(str);
		
		
	}

}
