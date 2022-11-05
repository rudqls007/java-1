package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerid, String custmomerName) {
		super(customerid, custmomerName);
		
		this.customerGrade="Gold";
		this.bonusRatio=0.02;
		this.salesRatio=0.1;
		
		System.out.println("GoldCustomer(int, String) 생성자 호출");
	}
	


	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -  (int)(price * salesRatio);
	}
	
	
}
