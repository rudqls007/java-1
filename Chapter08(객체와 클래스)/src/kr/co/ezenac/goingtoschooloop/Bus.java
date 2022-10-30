package kr.co.ezenac.goingtoschooloop;

public class Bus {
	
	
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
//		super();			기본 생성자를 호출하는 값
		this.busNumber = busNumber;
	}
	
	//승차하다
	
	public void ride(int money) {
		this.money += money;	// 돈 증가
		passengerCount++; // 승객 증가 		출력할 때마다 값이 올라감 값이 저장이 된다
	}
	
	public void showInfo( ) {
		System.out.println(busNumber + " 번 버스의 승객은 " + passengerCount + " 명이고, 수입은 " + money + "원 입니다. ");
	}
	
	
}
