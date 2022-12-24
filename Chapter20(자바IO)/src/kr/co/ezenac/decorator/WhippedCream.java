package kr.co.ezenac.decorator;

public class WhippedCream extends Decorator {

	public WhippedCream(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.println(" 휘핑 크림 추가 ");
	}

}
