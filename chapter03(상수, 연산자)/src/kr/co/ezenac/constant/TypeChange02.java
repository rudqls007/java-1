package kr.co.ezenac.constant;

public class TypeChange02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte num = 1;
		byte num2 = 2;
		// byte result1 = num + num2;
		
		byte result1 = (byte)(num + num2); // 강제 형변환
		
		int num3 = 1;
		int num4 = 2;
		
		int resuit2 = num3 + num4;
		
		long num5 = 1;
		long num6 = 2;
		
		long resuit3 = num3 + num4; 		// 자동 형변환 (4바이트인 int 값이 8바이트인 long 값에 자동 형변환 된 상황)
		
		
		float num7 = 1.0F;		// F 접미사
		float num8 = 2.0F;
		
		
		double num9 = 1.0;
		double num10 = 2.0;
		
		double resuit4 = num7 + num8; // 자동 형변환 
		

	}

}
