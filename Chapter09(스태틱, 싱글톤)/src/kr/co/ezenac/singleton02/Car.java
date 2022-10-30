package kr.co.ezenac.singleton02;
/*
 * 자동차 공장이 있습니다.
 * 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 생산될 때마다 고유의 차 번호가 부여됩니다.
 *  자동차 번호가 1001부터 시작이 되고 차가 생산될 때마다 1002, 1003번 이렇게 번호가 부여되도록
 *  자동차 공장 클래스(싱글톤 패턴), 자동차 클래스(staitc 변수)를 구현하시오
 *  아래 객체를 구현하여 실행결과가 나오도록 구현하시오
 *  
 *  
 *  1001 (출력)
 *  1002 (출력)
 */
public class Car {
	public static int seriaNum = 1000;
	public int CarNum;
	public String carF;

	
	
	public Car() {
		Car.seriaNum++;
		CarNum = seriaNum;
		
		
	}
	
	
	
	public int getCarNum() {
		return CarNum;
	}



	public void setCarNum(int carNum) {
		CarNum = carNum;
	}



	public String getCarF() {
		return carF;
	}



	public void setCarF(String carF) {
		this.carF = carF;
	}




}
