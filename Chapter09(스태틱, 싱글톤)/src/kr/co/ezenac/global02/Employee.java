package kr.co.ezenac.global02;

public class Employee {
	public static int serialNum = 1000;  // 스태틱 변수 1000으로 값을 초기화 함
	private int employeeId;	// 인스턴스 변수
	private String employeeName;
	private String department;
	
	public Employee() {  // 기본 생성자
		
		Employee.serialNum++; // 겹치지 않는 객체를 생성해줌
		employeeId = serialNum;
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
