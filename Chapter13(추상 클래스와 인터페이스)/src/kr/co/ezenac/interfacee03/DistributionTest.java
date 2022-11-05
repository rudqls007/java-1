package kr.co.ezenac.interfacee03;

import java.io.IOException;

public class DistributionTest {

	public static void main(String[] args) throws IOException {

		System.out.println("저화 상담원 할당 방식을 선택하세오");
		System.out.println("R : 한 명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선 순위가 높은 고객에 숙련도 높은 상담원");

		int ch = System.in.read();

		Distribution distribution = null;

		if (ch == 'R' || ch == 'r') {
			distribution = new RounDRobinCall();
		} else if (ch == 'L' || ch == 'l') {
			distribution = new LeastCall();
		} else if (ch == 'P' || ch == 'p') {
			distribution = new PriorityCall();
		} else {
			System.out.println("지원이 되지 않는 기능입니다.");
		}
		distribution.getNextCall();
		distribution.sendCalltoAgent();
		
	}

}
