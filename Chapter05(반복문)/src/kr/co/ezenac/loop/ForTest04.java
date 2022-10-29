package kr.co.ezenac.loop;

// 2의 배수를 출력하세요
// 0 ~ 8 
public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		for (  ; i < 10; i++) {
				
			if(i % 2 == 0) {
				System.out.print(" : " + i);
				
			}
						
		}
		
		i = 0;
		for ( ; i<10; ) {
			if(i % 2 == 0) 
				System.out.println( i + " ");
				i++;

			
		}
		System.out.println();
		
		//증감식 대한 연산 수식
		for(int j=0; j<10; j=j+2) {
			
			System.out.println(j + "");
			
		}
		
	}

}

