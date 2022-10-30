package kr.co.ezenac.global02;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Employee employee1 = new Employee(); // 기본 생성자 생성하면서 참조 변수를 초기화 하는 값

			employee1.setEmployeeName("이순신");
			
			Employee employee2 = new Employee();
			
			employee2.setEmployeeName("신사임당");
			
			System.out.println(employee1.getEmployeeName() + " ," + employee1.getEmployeeId());
			System.out.println(employee2.getEmployeeName() + " ," + employee2.getEmployeeId());
			
			System.out.println(Employee.serialNum);
			
	}

}
