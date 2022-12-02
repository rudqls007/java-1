package kr.co.ezenac.lambda06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import kr.co.ezenac.lambda02.MyNumber;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> consumer = (String str) -> System.out.println(str);
		consumer.accept("Good afernoon!");
		consumer.accept("Seoul Korea! ");
		System.out.println();

		Consumer<Integer> consumer2 = (Integer i) -> System.out.println(i);
		consumer2.accept(24);
		System.out.println();

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(23);
		for (int i = 0; i < 5; i++) {

			System.out.println(arrayList);
			
			
		}	System.out.println();

		List<Integer> integerslist = Arrays.asList(4, 2, 3);

		Consumer<Integer> consumer3 = x -> System.out.println("정수형 입력값 처리 : " + x); 
		
		consumer3.accept(24);
		
		spend(integerslist, consumer3);
		System.out.println();
		Consumer<Integer> myConsumer3 = x -> System.out.println("정수형 리스트 입력값 처리 :" + x);
		spend(integerslist, myConsumer3);
		System.out.println();
		List<Double> doublelist = Arrays.asList(3.2, 5.5, 2.1);
		Consumer<Double> myConsumer4 = y -> System.out.println("소수형 리스트 입력값 처리 :" + y);
		spend(doublelist, myConsumer4);
	}

	public static <T> void spend(List<T> inputs, Consumer<T> consumer) {
		for (T input : inputs)
			consumer.accept(input);

	}

}
