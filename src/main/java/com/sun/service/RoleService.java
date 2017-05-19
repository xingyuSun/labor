package com.sun.service;


import java.util.List;
import java.util.Map;

import com.sun.pojo.Role;

public interface RoleService {
	
	public boolean checkRole(Role Role);
	
	public boolean checkChange(Role Role);
	
	public boolean changeRole(Role Role);

	public List<Map<String,Object>> getRole();
	
	public int getIDByName(String rolename);
	
	public Role getRoleByuserId(int userId);
	
	public boolean deleteByPrimaryKey(Role Role);

	public boolean insert(Role Role);
	
}
