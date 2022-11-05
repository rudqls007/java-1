package kr.co.ezenac.interfacee06;

public class EzenClassTest {

	public static void main(String[] args) {
		EzenClass eClass = new EzenClass();
		
		X xclass = eClass;
		xclass.x();
		
		Y yclass = eClass;
		yclass.y();
		
		EzenClass iClass = eClass;
		iClass.x();
		iClass.y();
		iClass.myMthod();
		
	}

}
