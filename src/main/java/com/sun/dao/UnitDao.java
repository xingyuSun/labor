package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.UnitKey;

public interface UnitDao {
	public List<Map<String,Object>> checkUnit(UnitKey UnitKey);
	
	public List<Map<String,Object>> checkChange(UnitKey UnitKey);
	
	public List<Map<String,Object>> getUnit();
	
	public boolean changeUnit(UnitKey UnitKey);
	
	
	
	boolean deleteByPrimaryKey(UnitKey key);

	boolean insert(UnitKey record);

    int insertSelective(UnitKey record);
}