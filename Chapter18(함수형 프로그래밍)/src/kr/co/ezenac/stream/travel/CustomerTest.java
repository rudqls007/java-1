package kr.co.ezenac.stream.travel;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer1 = new Customer("이순신", 40, 100);
		Customer customer2 = new Customer("나대용", 20, 100);
		Customer customer3 = new Customer("신사임당", 13, 50);

		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println("===== 고객 명단 추가된 순서대로 출력 =====");

		customerList.stream().map(c -> c.getName()).forEach(v -> System.out.println(v));

		int sum = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + sum + "입니다.");
		System.out.println("===== 20세 이상 고객 명단 정렬하여 출력 =====");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach( c -> System.out.println(c));
		
	}

}
