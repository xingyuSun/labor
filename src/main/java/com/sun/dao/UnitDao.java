package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.UnitKey;

public interface UnitDao {
	public boolean checkUnit(UnitKey UnitKey);
	
	public List<Map<String,Object>> getUnit();
	
	public boolean changeUnit(UnitKey UnitKey);
	
	
	
    int deleteByPrimaryKey(UnitKey key);

    int insert(UnitKey record);

    int insertSelective(UnitKey record);
}