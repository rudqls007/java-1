package kr.co.ezenac.genericmethod;
/*
 * 두 점을 기준으로 사각형을 만들 때 사각형의 너비를 구하는 메서드를 만드시오
 * 두 점은 정수인 경우도 실수인 경우도 있으므로 제너릭 타입을 사용하여 구현한다
 */
public class Point<T, V> {
	
	T x;
	V y;  // 참조 변수로 일반화 시킨 상황
	
	Point(T x, V y){
		this.x = x;
		this.y = y; // 생성자 초기화
		
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}

}
