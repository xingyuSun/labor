package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.Project;

public interface ProjectDao {
	
	public List<Map<String,Object>> checkDivision(Project Project);
	
	public List<Map<String,Object>> checkChange(Project Project);
	
	public List<Map<String,Object>> getDivision();
	
	public boolean changeDivision(Project Project);
	
	boolean deleteByPrimaryKey(Project key);

	boolean insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Project key);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}