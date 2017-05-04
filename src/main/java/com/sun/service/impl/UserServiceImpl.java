package com.sun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.UserDao;
import com.sun.pojo.User;
import com.sun.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	public User getUserByLoginName(String str) {
		// TODO Auto-generated method stub
		return this.userDao.selectByloginname(str);
	}
	public boolean userCheckLoginName(User user) {
		// TODO Auto-generated method stub
		if(user==null) return false;
		
		User u=userDao.selectByloginname(user.getLoginname());
		//����ֵΪ������ݿ��в�����ʹ�ø�������û�
		if(u==null) return true;
		return false;
	}

	
	public boolean userCheckUser(User user) {
		// TODO Auto-generated method stub
		//判断用户是否存在
		boolean flg=userCheckLoginName(user);
		if(flg) return false;
		User u=userDao.selectByloginname(user.getLoginname());
		String password= u.getPassword();
		String userPassword=user.getPassword();
		if(userPassword.equals(password)) flg=true;
		else flg= false;
		
		return flg;

	}
	
	

	
	
}
