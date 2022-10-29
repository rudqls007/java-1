package kr.co.ezenac.operator02;

public class DenyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		boolean power = false;
		
		System.out.println(" power의 값 : " + power);
		
		power = !power;
		
		System.out.println(" power의 값 : " + power);
	
		
		power = !power;
		
		System.out.println(" power의 값 : " + power);
		
		
		
		if(!power) {	
			
			
			
			System.out.println(" if 문 실행된다 " );
			
		}
		
		if(power) {	
			
			
			
			System.out.println(" if 문 실행된다 !! " ); // power의 값은 이미 false(!power)로 정의 되고 있어 "power"는 부정이라 if 문이 실행이 되지 않음
			
		}
	}
	

}
