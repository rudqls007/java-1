package kr.co.ezenac.lambda02;
@FunctionalInterface
public interface MyNumber {
		int getMax(int num1, int num2);
//		int getMax(int num1, int num2);	// 여러 개의 메서드를 넣으면 에러가 남,
	
}
