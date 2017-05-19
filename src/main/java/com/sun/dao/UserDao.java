
package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.User;

public interface UserDao {
    boolean deleteByPrimaryKey(User User);

	public List<Map<String,Object>> getUser();

	public boolean changeUser(User User);
    
	boolean insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);
    
    User selectByloginname(String loginname);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}