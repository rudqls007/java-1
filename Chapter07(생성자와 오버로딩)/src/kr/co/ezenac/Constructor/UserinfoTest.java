package kr.co.ezenac.Constructor;

public class UserinfoTest {

	
	public static void main(String[] args) {
		
		UserInfo userInfo = new UserInfo();
		userInfo.userId = "ezen";
		userInfo.userPassWord = "0111";
		userInfo.userName ="Admiral Yi";
		
		System.out.println(userInfo.showUserInfo());
		
		UserInfo userInfo2 = new UserInfo("ezenac", "2023", "Shin"); // 오버로딩
		System.out.println(userInfo2.showUserInfo());
	}
}

