package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		Stream<String> str = Stream.of("곧 추석이", "다가 옵니다.", "연휴가 기다리고 있습니다.");
		List<String> list = str.collect(Collectors.toList());
		System.out.println(list);

		String[] str1 = new String[] { "서울", "뉴욕", "벤쿠버" };
		Stream<String> str2 = Arrays.stream(str1);
		List<String> list1 = str2.collect(Collectors.toList());
		System.out.println(list1);
	}
}
