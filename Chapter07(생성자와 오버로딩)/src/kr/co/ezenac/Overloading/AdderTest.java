package kr.co.ezenac.Overloading;

public class AdderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		int iResult = adder.add(10, 50);
		System.out.println("iResult : "+iResult);
		
		long lResult =adder.add(100,75000L);
		System.out.println("lResult : " + lResult);
		
		double dResult = adder.add(107.88, 11.55);
		System.out.println("dResult :" + dResult);
	}

}
