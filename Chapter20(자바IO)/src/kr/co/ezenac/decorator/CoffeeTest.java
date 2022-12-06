package kr.co.ezenac.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee kenya = new KenyaAmericano();
		kenya.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenya);
		kenyaLatte.brewing();
		System.out.println();
		
		Mocha keynaMocha = new Mocha(new Latte(kenya));
		keynaMocha.brewing();
		System.out.println();
		
		WhippedCream kenyaWhipped = new WhippedCream(new Mocha(new Latte(kenya)));
		kenyaWhipped.brewing();
		System.out.println();
		
		Coffee etiopia = new EtiopiaAmericano();
		etiopia.brewing();
		System.out.println();
		
		Coffee etiopiaLatte = new Latte(etiopia);
		etiopiaLatte.brewing();
		System.out.println();
		
		Mocha etiopiaMocha = new Mocha(new Latte(etiopia));
		etiopiaMocha.brewing();
		System.out.println();
		
		WhippedCream etiopiaWhipperdCream = new WhippedCream(new Mocha(new Latte(etiopia)));
		etiopiaWhipperdCream.brewing();
		System.out.println();
		
	}

}
