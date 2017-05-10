package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.Role;

public interface RoleDao {
	public List<Map<String,Object>> getRole();
	
    int deleteByPrimaryKey(Integer roleid);
    
    int getIDByName(String rolename);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}