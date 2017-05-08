package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.RightsDao;
import com.sun.pojo.Role;
import com.sun.service.RoleRightsService;

@Service("UserRightsService")
public class RoleRightsServiceImpl implements RoleRightsService {
	@Resource
	private RightsDao RightsDao;

	@Override
	public List<Map<String, Object>> getRoleRights() {
		// TODO Auto-generated method stub
		return this.RightsDao.getUserRights();
	}
	
}