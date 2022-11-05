package kr.co.ezenac.Utilizeinterface.userinfo.dao.mysql;

import kr.co.ezenac.Utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.Utilizeinterface.userinfo.dao.UserInfoDAO;

public class UserinfoMysqlDAO implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into Mysql DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into Mysql DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into Mysql DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into Mysql DB userid = " + userInfoDTO.getUserId());
	}

}
