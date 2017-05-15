package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.BuildingsKey;


public interface BuildingsDao {
	
	public List<Map<String,Object>> checkBuildings(BuildingsKey BuildingsKey);
	
	public List<Map<String,Object>> checkChange(BuildingsKey BuildingsKey);
	
	public List<Map<String,Object>> getBuildings();
	
	public boolean changeBuildings(BuildingsKey BuildingsKey);
	
	boolean deleteByPrimaryKey(BuildingsKey key);

	boolean insert(BuildingsKey record);

    int insertSelective(BuildingsKey record);
}