package kr.co.ezenac.singleton02;

public class Car1 {
	private static int seriaNum = 1000;
	private int carNum;

	
	public Car1(){
		
		seriaNum++;
		carNum = seriaNum;
		}


	public int getCarNum() {
		return carNum;
	}


	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
} 