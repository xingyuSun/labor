package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.DivisionKey;

public interface DivisionDao {
	
	public List<Map<String,Object>> checkDivision(DivisionKey DivisionKey);
	
	public List<Map<String,Object>> checkChange(DivisionKey DivisionKey);
	
	public List<Map<String,Object>> getDivision();
	
	public boolean changeDivision(DivisionKey DivisionKey);
	
	
	boolean deleteByPrimaryKey(DivisionKey key);

	boolean insert(DivisionKey record);

    int insertSelective(DivisionKey record);
}