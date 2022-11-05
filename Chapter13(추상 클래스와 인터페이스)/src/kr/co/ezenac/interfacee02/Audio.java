package kr.co.ezenac.interfacee02;

public class Audio implements RemoteControl {

	
	private  int volume;
	
	@Override
	public void trunOn() {
		System.out.println("오디오를 켭니다 ");
	}

	@Override
	public void trunOff() {
		System.out.println("오디오를 끕니다 ");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨이 0~!0 사이에서만 움직일 것으로 프로그래밍한다
		if (volume > RemoteControl.MAX_VOLUMN) {
			System.out.println(" 오디오 볼륨의 최대치 값은 10 입니다");
			this.volume = RemoteControl.MAX_VOLUMN;
		} else if (volume < RemoteControl.MIN_VOLUMN) {
			System.out.println(" 오디오 볼륨의 최소치 값은 0 입니다");
			this.volume = RemoteControl.MIN_VOLUMN;
		} else {
			this.volume = volume;
		} System.out.println(" 현재 오디오 볼륨 : " + volume);
	}
}
