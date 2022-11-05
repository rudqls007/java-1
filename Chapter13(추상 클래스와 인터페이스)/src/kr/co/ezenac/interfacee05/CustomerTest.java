package kr.co.ezenac.interfacee05;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayWorid();
		customer.order();
		
		System.out.println();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		System.out.println();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		

	}

}
