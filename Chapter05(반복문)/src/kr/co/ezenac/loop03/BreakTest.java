package kr.co.ezenac.loop03;


// 1부터 숫자를 더해 100이 넘는 순간의 그 숫자 합 출력
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0; // 합계인 변수 sum에 초기 0 값을 출력하게 함
		
		int num;	// 넘는 순간의 숫자를 출력하기 위한 변수 num 값을 출력함
		
		for(num = 1;  ; num++) { // for문을 이용해서 num 값을 1로 주고 num 값을 1씩 더함
			sum+= num;	// sum = sum + num 값을 출력하게 함
			if(sum >= 100) break;	// sum 값이 100이 넘어가면 for문을 빠져나오게 하는 break 문을 씀
		}
		System.out.println("100이 넘는 순간의 합 : " + sum);
		System.out.println("100이 넘는 순간의 num : "+ num);
	}

}
