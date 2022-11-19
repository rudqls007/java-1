package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("이순신 장군");
		list.add("나대용 구선 제작자");
		list.add("권율");
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.print( s + " \t "));
		System.out.println();
		
		//sorted() 중간 연산
		//forEach() 최종 연산
		list.stream().sorted().forEach(s -> System.out.print(s + "\t "));
		System.out.println();
		// filter() 보통 연산
		list.stream().map(s-> s.length()).forEach(n -> System.out.print(n + " \t "));
		System.out.println();
		list.stream().filter(s -> s.length() >= 7).forEach(s -> System.out.print( s + "\t "));
	}
}
