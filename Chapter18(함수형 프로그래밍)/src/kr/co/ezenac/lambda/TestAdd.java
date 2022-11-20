package kr.co.ezenac.lambda;

public class TestAdd {
	public static void main(String[] args) {
		
//		add addF = (int x, int y) -> {return x+y;};
		add addF = ( x, y) ->  x+y;			// 한 문장이면 리턴, 중괄호 생략 가능하다. 타입도 생략 가능 ex) int x, int y -> x,y
		
		
		
		
		System.out.println(addF.add(3, 5));
	}
}
