package kr.co.ezenac.lambda03;

import java.util.function.Function;

public class TestAdder02 {

	public static void main(String[] args) {
		Function<Integer, Integer> MyAdder = x -> x + 10; // 람다식
		int sum = MyAdder.apply(5);
		System.out.println(sum);
	}
}
