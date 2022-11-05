package kr.co.ezenac.Utilizeinterface.userinfo.dao.mssql;

import kr.co.ezenac.Utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.Utilizeinterface.userinfo.dao.UserInfoDAO;

public class UserinfoMssqlDAO implements UserInfoDAO {

	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into Mssql DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into Mssql DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into Mssql DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into Mssql DB userid = " + userInfoDTO.getUserId());
	}

}
