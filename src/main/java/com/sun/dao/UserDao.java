
package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer userid);

	public List<Map<String,Object>> getUser();

    
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);
    
    User selectByloginname(String loginname);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}