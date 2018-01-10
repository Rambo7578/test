package com.iot.test.dao;

import java.util.ArrayList;

import com.iot.test.vo.UserClass;

public interface UserDAO {

	ArrayList<UserClass> selectUserList();
	UserClass selectUser(int uiNO);
	UserClass selectUser(String uiId);
	int insertUser(UserClass uc);
	int deleteUser(UserClass uc);
	int updateUser(UserClass uc);

	
	
}
