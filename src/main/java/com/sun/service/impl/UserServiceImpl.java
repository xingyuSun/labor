package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.UserDao;
import com.sun.pojo.User;
import com.sun.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao UserDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.UserDao.selectByPrimaryKey(userId);
	}
	
	@Override
	public List<Map<String, Object>> getUser() {
		// TODO Auto-generated method stub
		return this.UserDao.getUser();
	}
	
	
	public User getUserByLoginName(String str) {
		// TODO Auto-generated method stub
		return this.UserDao.selectByloginname(str);
	}
	public boolean userCheckLoginName(User user) {
		// TODO Auto-generated method stub
		if(user==null) return false;
		
		User u=UserDao.selectByloginname(user.getLoginname());
		if(u==null) return true;
		return false;
	}

	
	public boolean userCheckUser(User user) {
		// TODO Auto-generated method stub
		//判断用户是否存在
		boolean flg=userCheckLoginName(user);
		if(flg) return false;
		User u=UserDao.selectByloginname(user.getLoginname());
		String password= u.getPassword();
		String userPassword=user.getPassword();
		if(userPassword.equals(password)) flg=true;
		else flg= false;
		
		return flg;

	}
	
	@Override
	public boolean changeUser(User User) {
		// TODO Auto-generated method stub
			if(this.UserDao.changeUser(User))
			return true;

			else
			return false;
	}

	@Override
	public boolean deleteByPrimaryKey(User User) {
		// TODO Auto-generated method stub
		if(this.UserDao.deleteByPrimaryKey(User))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(User User) {
		// TODO Auto-generated method stub
		if(userCheckLoginName(User)){
		  if(this.UserDao.insert(User))
			return true;
		  else
			return false;
		}
		else
		return false;
	}

	
}
