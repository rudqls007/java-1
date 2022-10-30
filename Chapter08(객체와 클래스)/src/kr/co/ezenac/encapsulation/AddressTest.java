package kr.co.ezenac.encapsulation;

import java.nio.Buffer;

public class AddressTest {

	public static void main(String[] args) {
		DisplayAddress displayAddress = new DisplayAddress();  // 기본 생성자 생성
		String buffer = displayAddress.getAddress();
		
		System.out.println(buffer);
		
		
		
	}
}
