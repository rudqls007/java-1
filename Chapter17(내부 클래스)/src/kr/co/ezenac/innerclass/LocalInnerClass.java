package kr.co.ezenac.innerclass;

import java.io.IOException;
import java.nio.CharBuffer;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {
		int num = 100;
		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
//				i = 100;				// 매개변수는 상수로 바뀐다
//				num = 200;		// 지역변수는 상수로 바뀐다 상수 풀이기 떄문에 값을 변경할 수 없음 ( 상수 )
				System.out.println(" i = " + i);
				System.out.println(" num = " + num);
				System.out.println(" localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스의 인스턴스 변수");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스의 정적 변수)");
			}

		}
		return new MyRunnable();

	}
}

public class LocalInnerClass {
	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runner = outer.getRunnable(10);
		runner.run(); // run 메서드 호출
	}
}
