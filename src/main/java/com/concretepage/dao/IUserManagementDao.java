package com.concretepage.dao;

import com.concretepage.entity.UserInfo;

public interface IUserManagementDao {
	UserInfo getUserInfoById(long userId);
	UserInfo getUserInfoByUserName(String userName);
	UserInfo getUserInfoByUserNameAndPassword(String userName, String password);
}
