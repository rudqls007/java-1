package kr.co.ezenac.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Company company1 = Company.getinstance();
			Company company2 = Company.getinstance();
			
			
			System.out.println(company1);
			System.out.println(company2);
			// Object 클래스의 equal(): 주소 비교
			if(company1.equals(company2)) {       
				System.out.println(" 같은 객체입니다.");
			}
			else {
				System.out.println(" 다른 객체 입니다");
			}
			// == 연산자 주소 값 비교
			if (company1 == company2) {
				System.out.println(" 같은 객체입니다");
			}
			else {
				System.out.println(" 다른 객체입니다");
			}
	}

}
