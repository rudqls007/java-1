package kr.co.ezenac.member;

public class Monitor {


	// 맴버변수 (필드)
	String color; 		// 모니터 색상
	int channel;		// 채널
	int volume; 		// 볼륨
	boolean power; // 전원 on/off
	
	
	
	// 맴버 메서드
	// Monitor를 켜거나 끄는 기능
	public void power() {
			if (!power) {
				System.out.println("모니터가 켜졌습니다.");
				this.power = !power;
			} else {
				System.out.println("모니터가 꺼졌습니다.");
				this.power = !power;
			}
			
	}
	public void channelUp() {
				this.channel++;
				System.out.println(" 현재 채녈 :" + this.channel);
	}
	public void channelDown() {
				// this.channel--; 밑에 (--this.channel) 로 바꾸어 사용하면 가독성이 더 좋다 (?)
				System.out.println(" 현재 채녈 :" + (--this.channel));
	}

}
