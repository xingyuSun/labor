package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.Rights;

public interface RightsDao {
	public List<Map<String,Object>> getUserRights();
	
	public List<Map<String,Object>> getRights();
	
    int deleteByPrimaryKey(Integer rightsid);

    int insert(Rights record);

    int insertSelective(Rights record);

    Rights selectByPrimaryKey(Integer rightsid);

    int updateByPrimaryKeySelective(Rights record);

    int updateByPrimaryKey(Rights record);
}