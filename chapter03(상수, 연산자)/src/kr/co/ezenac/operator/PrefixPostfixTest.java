package kr.co.ezenac.operator;

public class PrefixPostfixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 10;
		System.out.println(++num); 		//num(10) 값 하나가 증가 후 출력된다
		System.out.println(num);
		
		System.out.println(num++);			// num(10) 값 하나가 출력 후에 값이 증가한다
		System.out.println(num);
		
		
		System.out.println("--------------");
		
		int x = 10;
		int y = 10;
		
		System.out.println(" x = " + (x++));
		System.out.println(" x = " + x);
		System.out.println(" y = " + (++y));
		System.out.println(" y = " + y);
	}

}
