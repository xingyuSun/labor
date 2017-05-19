package com.sun.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.RoleDao;
import com.sun.pojo.Role;



import com.sun.pojo.Role;
import com.sun.service.RoleService;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleDao RoleDao;
	@Override
	public boolean checkRole(Role Role) {
		// TODO Auto-generated method stub
		System.out.println(Role.getRoleid());
		if(RoleDao.checkRole(Role).isEmpty())
		{
		   return true;
		}
		else
		{
		   return false;
		}
	}
	
	@Override
	public boolean checkChange(Role Role) {
		// TODO Auto-generated method stub
		if(this.RoleDao.checkChange(Role).isEmpty())
		   return true;
		else
		   return false;
	}
	@Override
	public boolean changeRole(Role Role) {
		// TODO Auto-generated method stub
		if(checkChange(Role)){
			  if(this.RoleDao.changeRole(Role))
				return true;
			  else
				return false;
			}
			else
			return false;
		
		
	}
	
	
	@Override
	public boolean deleteByPrimaryKey(Role Role) {
		// TODO Auto-generated method stub
		if(this.RoleDao.deleteByPrimaryKey(Role))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(Role Role) {
		// TODO Auto-generated method stub
		if(checkRole(Role)){
		  if(this.RoleDao.insert(Role))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
	
	
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
	
	@Override
	public int getIDByName(String rolename) {
		// TODO Auto-generated method stub
		return this.RoleDao.getIDByName(rolename);
	}
	
}
