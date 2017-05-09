package com.sun.service;


import java.util.List;
import java.util.Map;

import com.sun.pojo.Role;
import com.sun.pojo.rolerightsKey;


public interface RoleRightsService {

	public List<Map<String,Object>> getRoleRights();
	
	public List<Map<String,Object>> getRights();
	
	public boolean deleteRoleRights(rolerightsKey rolerightsKey);
	
	public boolean insertRoleRights(String rolename,String rightsname);
	
	
}
