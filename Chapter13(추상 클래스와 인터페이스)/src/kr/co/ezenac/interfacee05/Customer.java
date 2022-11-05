package kr.co.ezenac.interfacee05;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
	}

	public void sayWorid() {
		System.out.println("Hello");
	}

	@Override
	public void order() {
		System.out.println(" customer order");
	}

}
