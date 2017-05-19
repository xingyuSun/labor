package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.Role;
import com.sun.pojo.Role;

public interface RoleDao {
	public List<Map<String,Object>> getRole();
	
	public List<Map<String,Object>> checkRole(Role Role);
	
	public List<Map<String,Object>> checkChange(Role Role);
	
	public boolean changeRole(Role Role);
	
	boolean deleteByPrimaryKey(Role Role);
    
    int getIDByName(String rolename);

    boolean insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}