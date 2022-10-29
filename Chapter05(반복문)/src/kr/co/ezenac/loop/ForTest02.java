package kr.co.ezenac.loop;

//누적 합계가 2000이상 일 때 ㅑ의 값을 출력하시오

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int temp = 0;

		for (int i = 1; i <= 100; i++) {

			sum += i;
			if (sum >= 2000) {

				temp = i;
			
				break;
			
			}
			

		}
		System.out.println(" 2000이상 일 때 i의 값은 : " + temp);
		System.out.println(" 2000이상 일 때 sum의 값은 : " + sum);
	}
}
