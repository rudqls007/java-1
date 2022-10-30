package kr.co.ezenac.member02;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	// getter() = 값을 읽는다
	public int getHour( ) {
		return this.hour; // this는 참조 변수
	}
	// setter() = 값을 설정해 준다
	 public void setHour(int hour) {
		 // 예외처리 코드를 작성
		 if(hour < 0 || hour > 23) {
			 System.out.println(" 시간을 잘못 입력하셨습니다.");
		 return;  // 호출한 곳으로 다시 돌아감
		 }
		 this.hour = hour;
	 }
	 
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		// 분에 대한 예외처리 코드를 작성해야 한다
		if(minute < 0  || minute > 59) {
			System.out.println(" 분을 잘못 입력하셨습니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		// 초에 대한 예외처리 코드를 작성해야 한다
		if(second < 0 || second > 59) {
			System.out.println(" 초를 잘못 입력하셨습니다.");
		}
		this.second = second;
	}
	
	public String toString() {
			
		 return this.getHour() +  " 시 "  + this.minute + "분" + this.second + "초";
	}
	
	
}
