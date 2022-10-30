package kr.co.ezenac.member;

public class MonitorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Monitor monitor = new Monitor(); // 생성자
		
		monitor.power(); // 모니터의 power 메소드를 호출했다.
		monitor.power(); // 모니터의 power 메소드를 호출했다.
		monitor.power(); // 모니터의 power 메소드를 호출했다.
		
		monitor.channel = 5;
		monitor.channelUp();
		monitor.channelUp();
		
		monitor.channelDown();
		monitor.channelDown();

	}

}
