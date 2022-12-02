package kr.co.ezenac.lambda05;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Ezen";

		StringConcat concat = new StringConCatImple();
		
		concat.makeStirng(s1, s2);
		
		StringConcat concat2 = (s, v) -> System.out.println(s + ", " + v); 	// 람다식
		concat2.makeStirng(s1, s2);
		
		StringConcat concat3 = new StringConcat() {				// 익명 함수
			
			@Override
			public void makeStirng(String s1, String s2) {
				
				System.out.println(s1 + ", " + s2);
			}
		};
	concat3.makeStirng(s1, s2);
	}
	

}
