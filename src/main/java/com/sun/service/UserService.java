package com.sun.service;

import com.sun.pojo.User;

public interface UserService {
	//
	public User getUserById(int userId);
	
//	public boolean userCheckName(User user);
//	
	public boolean userCheckLoginName(User user);
	//判断用户信息是否正确（登陆名密码）
	public boolean userCheckUser(User user);
	
	public User getUserByLoginName(String str);
	
}
