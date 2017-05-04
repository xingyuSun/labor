
package com.sun.dao;

import com.sun.pojo.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer userid);

    

    
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);
    
    User selectByloginname(String loginname);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}