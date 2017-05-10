package com.sun.dao;

import org.apache.ibatis.annotations.Param;

import com.sun.pojo.rolerightsKey;

public interface RoleRightsDao {
	
    public void deleteByPrimaryKey(rolerightsKey key);

   // public void insertRoleRights(@Param("roleid")int roleid, @Param("rightsid")int rightsid);
    
    public rolerightsKey getRoleRights();
    
    boolean insert(rolerightsKey rolerightsKey);

    int insertSelective(rolerightsKey record);
}