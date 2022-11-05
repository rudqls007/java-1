package kr.co.ezenac.Utilizeinterface.userinfo.dao.oracle;

import kr.co.ezenac.Utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.Utilizeinterface.userinfo.dao.UserInfoDAO;

public class UserinfoOrcleDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into ORACLE DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into ORACLE DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into ORACLE DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into ORACLE DB userid = " + userInfoDTO.getUserId());
	}

}
