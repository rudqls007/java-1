package kr.co.ezenac.membership02;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerL = new Customer(20220831, "이순신"); // Customer 생성자
//		customerL.setCustomerName("이순신");
//		customerL.setCustomerId(20220831);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());

		System.out.println();

		VIPCustomer customerS = new VIPCustomer(20220901, "신사임당"); // VIP Customer 생성자
//		customerS.setCustomerName("신사임당");
//		customerS.setCustomerId(20220901);
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());

		System.out.println();

		Customer customerL2 = new VIPCustomer(20220902, "이방원"); // UpCasting 자식 클래스인 VIP 클래스는 부모 클래스 Customer의 모든 것을  가지고 있기 때문에 가능하다
		//customerL2는 Customer 클래스의 맴버 변수와 메서드만 사용이 가능하다																											

		customerL2.bonusPoint = 1000;
		System.out.println(customerL2.showInfo());
	}
}
