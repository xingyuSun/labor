package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.DepartmentKey;

public interface DepartmentDao {
	public List<Map<String,Object>> checkDepartment(DepartmentKey DepartmentKey);
	
	public List<Map<String,Object>> checkChange(DepartmentKey DepartmentKey);
	
	public List<Map<String,Object>> getDepartment();
	
	public boolean changeDepartment(DepartmentKey DepartmentKey);
	
	
	boolean deleteByPrimaryKey(DepartmentKey key);

	boolean insert(DepartmentKey record);

    int insertSelective(DepartmentKey record);
}