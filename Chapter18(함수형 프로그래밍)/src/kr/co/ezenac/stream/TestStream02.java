package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import kr.co.ezenac.stream.model.User;

public class TestStream02 {
	public static void main(String[] args) {

		Stream<Integer> numberstream = Stream.of(3, -5, 7, 10, -3);
		Stream<Integer> filteredNumberStream = numberstream.filter(x -> x > 0);
		List<Integer> filterednumber = filteredNumberStream.collect(Collectors.toList());
		System.out.println(filterednumber);
		List<Integer> numberStream2 = Stream.of(3, -5, 7, 10, -3).filter(x -> x > 0).collect(Collectors.toList());
		System.out.println(numberStream2);

		User user1 = new User().setId(101).setName("Micheal").setVerified(true).setEmailAddress("Michael@gmail.com");

		User user2 = new User().setId(202).setName("KyungBin").setVerified(false)
				.setEmailAddress("dlrudqls55@naver.com");

		User user3 = new User().setId(303).setName("rudqls").setVerified(true).setEmailAddress("rudqls007@naver.com");

		List<User> users = Arrays.asList(user1, user2, user3);

		List<User> users1 = users.stream().filter(user -> user.isVerified()).collect(Collectors.toList());
		System.out.println(users1);
		System.out.println();
		List<User> users2 = users.stream().filter(user -> !(user.isVerified())).collect(Collectors.toList());
		System.out.println(users2);
		

	}
}