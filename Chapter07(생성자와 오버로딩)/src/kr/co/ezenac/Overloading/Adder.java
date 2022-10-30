package kr.co.ezenac.Overloading;

public class Adder {
	
	
	//add() 메서드명으로 오버로딩을 한다
	
	public int add(int x, int y) {
		
		System.out.println("add(int x, int y)");
		return x + y;
		
		
	}
		//public int add(int a, int b) {
		//return a + b;
		//	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x+y;
	}
	
	public double add(double x, double y) {
		System.out.println("(double x, double y)");
		return x + y;
	}
}
