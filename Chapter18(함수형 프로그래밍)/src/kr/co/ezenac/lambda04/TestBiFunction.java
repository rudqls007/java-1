package kr.co.ezenac.lambda04;

import java.util.function.BiFunction;

import kr.co.ezenac.lambda.add;

/*
 *		BiFunction Interface
 *			- 매개변수가 두 개일 때
 */
public class TestBiFunction {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> Add = (x, y) -> x + y;
		int sum = Add.apply(3, 9);
		
		System.out.println(sum);
	}
}
