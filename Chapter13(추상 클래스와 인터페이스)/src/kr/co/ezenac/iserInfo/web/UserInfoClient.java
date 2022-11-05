package kr.co.ezenac.iserInfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.Utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.Utilizeinterface.userinfo.dao.UserInfoDAO;
import kr.co.ezenac.Utilizeinterface.userinfo.dao.mssql.UserinfoMssqlDAO;
import kr.co.ezenac.Utilizeinterface.userinfo.dao.mysql.UserinfoMysqlDAO;
import kr.co.ezenac.Utilizeinterface.userinfo.dao.oracle.UserinfoOrcleDAO;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");

		Properties properties = new Properties();
		properties.load(fis);
		String dbtype = properties.getProperty("DBTYPE"); // 리턴 타입 : String

		UserInfoDTO userInfoDTO = new UserInfoDTO();

		userInfoDTO.setUserId("ezen");
		userInfoDTO.setPasswd("0111");
		userInfoDTO.setUserName("이순신");

		UserInfoDAO userInfoDAO = null;
		if (dbtype.equals("ORACLE")) {
			userInfoDAO = new UserinfoOrcleDAO(); // 다형성 적용
		} else if (dbtype.equals("Mysql")) {
			userInfoDAO = new UserinfoMysqlDAO(); // 다형성 적용
		} else if (dbtype.equals("Mssql")) {
			userInfoDAO = new UserinfoMssqlDAO(); // 다형성 적용
		}else {
			System.out.println("db support error");
			return;
		}
		userInfoDAO.insertUserInfo(userInfoDTO);
		userInfoDAO.updateUserInfo(userInfoDTO);
		userInfoDAO.deleteUserInfo(userInfoDTO);
		userInfoDAO.selectUserInfo(userInfoDTO);
	}
}
