package kr.co.ezenac.singleton02;

import kr.co.ezenac.singleton.Company;

public class CarF {
	
	private static CarF instance = new CarF(); // 참조 변수
	private CarF(){
		
	}

	public static CarF getinstance() {
	if(instance == null)
		instance = new CarF();	
	
	return instance;
	}
	
}
