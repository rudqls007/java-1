package kr.co.ezenac.interfacee02;

public class RemoteTest {
	public static void main(String[] args) {
		//인터페이스 일종의 조상이므로 필드(변수)의 다형성이 허용된다
		RemoteControl rControl = new Audio(); // 다형성 적용
		rControl.trunOn();
		rControl.setVolume(15);
		rControl.setVolume(-100);
		rControl.trunOff();
		
		System.err.println();
		
		RemoteControl tControl = new Television();
		tControl.trunOn();
		tControl.setVolume(15);
		tControl.setVolume(-10);
		tControl.trunOff();
		
		
	}
}
