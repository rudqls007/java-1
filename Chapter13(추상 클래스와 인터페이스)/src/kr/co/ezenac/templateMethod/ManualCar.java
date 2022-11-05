package kr.co.ezenac.templateMethod;

public class ManualCar extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지합니다.");
	}

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다..");
		System.out.println("휘발유가 이는 상태에서 운행합니다..");
	}

}
