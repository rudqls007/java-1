package kr.co.ezenac.member02;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Time time = new Time();
//		time.setHour(-20);
		time.setHour(10);
		System.out.println(time.getHour());
		System.out.println(time);		
		System.out.println(time.toString());
		
		time.setMinute(30);
		time.setSecond(50);
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		System.out.println(time);	//toString() 생성자로서 스킵이 가늫하다
		
		time.setHour(50);	// 범위 내에서 설정해야 한다
		time.setMinute(100);
		time.setSecond(100);
		System.out.println(time);
	}

}
