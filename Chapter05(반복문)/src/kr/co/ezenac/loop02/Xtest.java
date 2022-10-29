package kr.co.ezenac.loop02;
//
//
//*   *    3칸
// * *     1칸
//  *      
// * *     1칸
//*   *
 
public class Xtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int size = 5;
//		
//		for( int i = 1; i <= size; i++) {
//			for( int j = 1; j <= size; j++) {
//				if( i == j ||  i + j == 6) {
//					System.out.print( "*");
//				}
//				
//				else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//			
//			
//		}
		
		int x=1;
		int y=5;
		
		for(int i =0; i <5; i++) {
			for(int j =0; j < 5; j++) {
				if(i ==j || i+j==4) {
					System.out.print("*");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
	}
}
