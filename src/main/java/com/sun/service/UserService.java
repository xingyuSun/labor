package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.User;
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
	
	
	public List<Map<String,Object>> getUser();
	
	public boolean changeUser(User User);
	
	public boolean deleteByPrimaryKey(User User);

	public boolean insert(User User);
	

	
}
