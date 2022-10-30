package kr.co.ezenac.array;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//길이가 3인 int형 1차원 배열 생성
		
		int[] arr1 = new int[3];
		
		arr1[0] = 100;			// 1 요소
		arr1[1] = 90;
		arr1[2] = 80;				
		
		int sum = arr1[0] + arr1[1] + arr1[2];
		System.out.println(sum);
		
		
		int[] arr2 = new int[10];
		
		int total = 0;
		
		for(int i=0, num=1; i<arr2.length; i++, num++) {
			arr2[i] = num;
			
		}
		for(int i=0; i<arr2.length; i++) {
			total += arr2[i];
		}
		System.out.println(total);
	}

}
