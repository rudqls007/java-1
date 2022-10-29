package kr.co.ezenac.loop04;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 합을 출력하시오
		
		int sum = 0;
		int num = 1;  // while문은 초기화하는 부분이 따로 존재하지 않는다.
		
		while(num<=10){ // while문 옆에는 조건식만 들어간다
			
			sum += num;	// 변수 sum 값에 = sum + num 를 출력하는 식을 만든다 
			num++; // num 값이 1에서 10까지 누적될 수 있도록 num 값을 1씩 증가하는 코드
			
			
			
		}
		System.out.println(" 1~10까지의 합 :  " + sum); // num 값이 10까지 증가하여 while 문을 벗어나서 1 ~10까지의 합인 55가 출력되며 나온다
		System.out.println( );
		
		/*
		 *  while 문은 무한루프용으로 많이 사용한다
		 *  if문, break문과 함께 무한루프를 벗어날 코드를 작성해 주어야한다
		 */
		int i = 1; // 변수 i의 값에 1을 출력
		while(true) { // while ture일 때 while문을 벗어나게끔 하는 코드
			System.out.println(i);		// i를 출력
			if(i >= 100) break;	// 조건문 if문에 i를 100보다 크거나 같을 때 while문을 빠져나가게하는 조건문을 만듦
			i++;	// i가 1씩 증가함
		}
	}

}
