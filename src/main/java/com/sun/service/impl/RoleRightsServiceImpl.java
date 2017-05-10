package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.RoleRightsDao;
import com.sun.dao.RightsDao;
import com.sun.pojo.Role;
import com.sun.pojo.rolerightsKey;
import com.sun.service.RoleRightsService;

@Service("UserRightsService")
public class RoleRightsServiceImpl implements RoleRightsService {
	@Resource
	private RightsDao RightsDao;
	@Resource
	private RoleRightsDao RoleRightsDao;

	@Override
	public int getIDByName(String rightsname) {
		// TODO Auto-generated method stub
		return this.RightsDao.getIDByName(rightsname);
	}
	
	
	@Override
	public List<Map<String, Object>> getRoleRights() {
		// TODO Auto-generated method stub
		return this.RightsDao.getUserRights();
	}
	
	@Override
	public List<Map<String, Object>> getRights() {
		// TODO Auto-generated method stub
		return this.RightsDao.getRights();
	}
	
	@Override
	public boolean  deleteRoleRights(rolerightsKey rolerightsKey) {
		// TODO Auto-generated method stub
		RoleRightsDao.deleteByPrimaryKey(rolerightsKey);
		return true;
	}
	
	@Override
	public boolean  insertRoleRights(rolerightsKey rolerightsKey) {
		// TODO Auto-generated method stub
		if(RoleRightsDao.insert(rolerightsKey))
		  return true;
		else
		  return false;
	}
	
}