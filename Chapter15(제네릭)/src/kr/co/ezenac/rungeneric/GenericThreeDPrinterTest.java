package kr.co.ezenac.rungeneric;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {

		GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<>();
		Powder powder = new Powder();
		powderPrinter.setMeterial(new Powder());
		System.out.println(powder);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMeterial(new Plastic());
		System.out.println(plastic);
		
	
		 
	}

}
