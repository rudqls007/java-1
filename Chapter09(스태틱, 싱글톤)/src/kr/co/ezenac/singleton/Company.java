package kr.co.ezenac.singleton;

public class Company {
	
	private static Company instance = new Company(); // 참조 변수
	
	
	private Company() {
		
	}
	
	public static Company getinstance() {
		if(instance == null) 
			instance = new Company();
			
		
		return instance;
	}
}
