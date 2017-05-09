package com.sun.dao;

import org.apache.ibatis.annotations.Param;

import com.sun.pojo.rolerightsKey;

public interface RoleRightsDao {
	
    public void deleteByPrimaryKey(rolerightsKey key);

    public void insertRoleRights(@Param("rolename")String rolename, @Param("rightsname")String rightsname);
    
    int insert(rolerightsKey record);

    int insertSelective(rolerightsKey record);
}