package kr.co.ezenac.generic;

public class GnenricThreeDprinterTest {

	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> powerPrinter = new GenericThreeDPrinter<>();
		Powder powder = new Powder();
		powerPrinter.setMeterial(powder);
		System.out.println(powerPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMeterial(plastic);
		System.out.println(plasticPrinter);
		
		powerPrinter.print();
		plasticPrinter.print();
		
		
	}

}
