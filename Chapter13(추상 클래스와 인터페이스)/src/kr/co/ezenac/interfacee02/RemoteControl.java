package kr.co.ezenac.interfacee02;

public interface RemoteControl {
	//상수 (static final)
	
	int MAX_VOLUMN	=	10;
	int MIN_VOLUMN	 	=	8;
	
	
	//추상메서드 (abstract)
	
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);
	
}
