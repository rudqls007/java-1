package kr.co.ezenac.array;
class Box {
	
	
}
public class ArrayTest {
	
	public static void main(String[] args) {
		// 길이가 5인 int형 1차원 배열 생성
		
		int[] arr1 = new int[5];
		
		// 배열 생성 및 초기화(방법1)
		// 개수 생략
		int[] arr2 = new int[] {1, 2, 3, 4, 5};		// 배열 뒤에 초기화하는 데이터 개수를 보고 생략된 숫자를 컴파일러가 유추할 수 있다
	
		// 배열 생성 및 초기화(방법2)
		// new int[] 생략 가능
		int[] arr3 = {1, 2, 3, 4, 5};					// 뒤에 초기화하는 데이터를 보고 당연히 배열의 초기화 값이라고 유추한다
		
		// 배열 선언 후 배열을 생성하는 경우
		// new int[] 생략 불가
		int[] arr4; // 선언
		arr4 = new int[] {1, 2, 3, 4, 5};
		
		// 길이가 7인 double형 1차원 배열 생성하시오. (arr5)
		
		double[] arr5;
		arr5 = new double[] {1, 2, 3, 4, 5, 6, 7};
		
		// 길이가 9인 float형 1차원 배열을 생성하시오. (arr6)
		// 배열의 참조 변수와 객체 생성 분리
		
		float[] arr6;
		arr6 = new float[9]; 
		
		//객체 대상 1차원 배열
		Box[] arr7 = new Box[5];
		
		
		// 배열의 객체 변수
		System.out.println("arr1 길이 :" + arr1.length);
		System.out.println("arr2 길이 :" + arr2.length);
		System.out.println("arr3 길이 :" + arr3.length);
		System.out.println("arr4 길이 :" + arr4.length);
		System.out.println("arr5 길이 :" + arr5.length);
		System.out.println("arr6 길이 :" + arr6.length);
		System.out.println("arr7 길이 :" + arr7.length);
		
		
		int[] score = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = i * 10;
			System.out.println(score[i]);
		}
	}

}
