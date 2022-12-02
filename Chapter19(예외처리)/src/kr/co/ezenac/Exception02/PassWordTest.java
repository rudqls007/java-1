package kr.co.ezenac.Exception02;


public class PassWordTest {
	
	private String password;
	
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {
		PassWordTest test = new PassWordTest();
		String password =null;
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			password = "ezen";
			try {
				test.setPassword(password);
			} catch (PasswordException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}
}
