package com.concretepage.service;

import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;

import com.concretepage.entity.Article;
import com.concretepage.entity.UserInfo;

public interface IUserManagementService {
	UserInfo getUserInfoByUserNameAndPassword(String userName, String password);
	UserInfo getUserInfoByEmailAndPassword(String email, String password);
	boolean addUser(UserInfo userInfo);
    void updateUser(UserInfo userInfo);
    void deleteUser(int userId);
}
