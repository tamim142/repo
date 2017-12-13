package com.concretepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IUserManagementDao;
import com.concretepage.entity.UserInfo;

@Service
public class UserManagementServiceImpl implements IUserManagementService{

	@Autowired
	IUserManagementDao userDao;
	
	@Override
	public UserInfo getUserInfoByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		userDao.getUserInfoByUserNameAndPassword(userName, password);
		return null;
	}

	@Override
	public UserInfo getUserInfoByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

}
