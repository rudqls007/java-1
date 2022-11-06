package kr.co.ezenac.object;
/*
 *  날짜를 구현한 클래스 MyDate
 *  날짜가 같으면 equal() 메서드 결과가 true가 되도록 구현하시오.
 *  hashCode() 메서드도 구현해 보시오.
 */





public class MyDateTest {
	public static void main(String[] args) {

		MyDate date1 = new MyDate(2022, 9, 5);
		MyDate date2 = new MyDate(2022, 9, 5);

		System.out.println(date1.equals(date2));
		
//		System.out.println(date1 == date2);
//
//		System.err.println(date1.equals(date2));
//
//		System.out.println(date1.hashCode());
//
//		System.out.println(date2.hashCode());
//		System.out.println();
	}
}
