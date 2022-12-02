package kr.co.ezenac.Exception;

public class AutocloseableeTestMain {
	
	public static void main(String[] args) {
		
		AutoCloseableTest obj = new AutoCloseableTest();
		try(obj) {
			System.out.println("프로그램 실행");
		} catch(Exception e) {
			System.out.println("예외 처리 부분입니다.");
		}
	}
}
