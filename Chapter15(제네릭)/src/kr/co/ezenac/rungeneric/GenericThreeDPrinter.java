package kr.co.ezenac.rungeneric;

public class GenericThreeDPrinter<T> { // 자료형 <T> 를 일반화 시킴
	private T material; // T 자료형으로 선언한 (참조)변

	public T getMeterial() { // T 자료형을 변환하는 제너릭 메서드
		return material;
	}

	public void setMeterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
}
