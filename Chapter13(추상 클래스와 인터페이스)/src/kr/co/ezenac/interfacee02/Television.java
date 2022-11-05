package kr.co.ezenac.interfacee02;

public class Television implements RemoteControl {
	private int volume;
	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUMN) {
			System.out.println(" TV 볼륨의 최대치 값은 10 입니다");
			this.volume = RemoteControl.MAX_VOLUMN;
		} else if (volume < RemoteControl.MIN_VOLUMN) {
			System.out.println(" TV 볼륨의 최소치 값은 0 입니다");
			this.volume = RemoteControl.MIN_VOLUMN;
		} else {
			this.volume = volume;
		} System.out.println(" 현재 TV 볼륨 : " + volume);

	}
}
