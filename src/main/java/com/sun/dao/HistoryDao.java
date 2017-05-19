package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.History;

public interface HistoryDao {
    int deleteByPrimaryKey(Integer historyid);

	public List<Map<String,Object>> getHistory();
    
    
    boolean insert(History record);

    int insertSelective(History record);

    History selectByPrimaryKey(Integer historyid);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);
}