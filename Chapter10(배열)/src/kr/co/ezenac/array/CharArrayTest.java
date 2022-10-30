package kr.co.ezenac.array;


// 문자 배열을 만들어 a~z까지 배열에 저장하고 이를 ㅜㄹ력하시오

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] arr1 = new char[26];
		
		char ch = 'A';
		 
		 for(int i = 0; i<arr1.length; i++) {
			 
			arr1[i] = ch++;
		 }
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " ," + (int)arr1[i]);
		}
		 System.out.println();
		 
		 //향상된 for 문
		 for ( char ch1 : arr1) {
			 System.out.println(ch1 + "," + (int)ch1);
			 
		 }
	
	}

}
