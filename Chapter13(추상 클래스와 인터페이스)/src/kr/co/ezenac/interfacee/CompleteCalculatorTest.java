package kr.co.ezenac.interfacee;

public class CompleteCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new CompleteCalculator(); // 다형성 적용, 캐스팅 적용
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calc.substract(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calc.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
	}

}
