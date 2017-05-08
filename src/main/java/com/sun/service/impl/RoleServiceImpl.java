package com.sun.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.RoleDao;
import com.sun.pojo.Role;
import com.sun.service.RoleService;
import com.sun.service.UserService;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleDao RoleDao;
	@Override
	public Role getRoleByuserId(int userId) {
		// TODO Auto-generated method stub
		return this.RoleDao.selectByPrimaryKey(userId);
	}
	@Override
	public List<Map<String, Object>> getRole() {
		// TODO Auto-generated method stub
		return this.RoleDao.getRole();
	}
	
}
