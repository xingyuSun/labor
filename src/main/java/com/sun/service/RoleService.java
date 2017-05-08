package com.sun.service;


import java.util.List;
import java.util.Map;

import com.sun.pojo.Role;

public interface RoleService {

	public List<Map<String,Object>> getRole();
	
	
	public Role getRoleByuserId(int userId);
	
}
