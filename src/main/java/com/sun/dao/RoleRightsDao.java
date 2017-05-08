package com.sun.dao;

import com.sun.pojo.rolerightsKey;

public interface RoleRightsDao {
    int deleteByPrimaryKey(rolerightsKey key);

    int insert(rolerightsKey record);

    int insertSelective(rolerightsKey record);
}