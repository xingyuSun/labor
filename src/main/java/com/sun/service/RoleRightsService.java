package com.sun.service;


import java.util.List;
import java.util.Map;

import com.sun.pojo.Role;
import com.sun.pojo.rolerightsKey;


public interface RoleRightsService {

	public List<Map<String,Object>> getRoleRights();
	
	public List<Map<String,Object>> getRights();
	
	public int getIDByName(String rightesname);
	
	public boolean deleteRoleRights(rolerightsKey rolerightsKey);
	
	public boolean insertRoleRights(rolerightsKey rolerightsKey);
	
	
}
