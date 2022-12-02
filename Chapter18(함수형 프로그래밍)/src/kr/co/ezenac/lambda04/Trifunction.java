package kr.co.ezenac.lambda04;

import java.util.function.BiFunction;

public class Trifunction {

	public static void main(String[] args) {

		Function<Integer, Integer, Integer, Integer> sum = (x, y, z) -> x + y + z;
		
		int result = sum.apply(3, 2, 1);
		
		System.out.println(result);
	}

}
