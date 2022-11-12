package kr.co.ezenac.innerclass;

class Outter {

	Runnable getReadable(int i) {
		int num = 100;

		return new Runnable() {
			int localNum = 10;

			@Override
			public void run() {
//			i = 100;				// 매개변수는 상수로 바뀐다
//			num = 200;		// 지역변수는 상수로 바뀐다 상수 풀이기 떄문에 값을 변경할 수 없음 ( 상수 )
				System.out.println(" i = " + i);
				System.out.println(" num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스의 정적 변수)");
			}

		};

	}

	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		Outter outer = new Outter();
		Runnable runnable = outer.getReadable(10);
		runnable.run();
		
		outer.runner.run();
	}

}
