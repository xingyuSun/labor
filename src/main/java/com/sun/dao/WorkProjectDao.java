package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.WorkProject;

public interface WorkProjectDao {

	
	public List<Map<String,Object>> checkDivision(WorkProject WorkProject);
	
	public List<Map<String,Object>> checkChange(WorkProject WorkProject);
	
	public List<Map<String,Object>> getDivision();
	
	public boolean changeDivision(WorkProject WorkProject);	
	
	boolean deleteByPrimaryKey(WorkProject key);

	boolean insert(WorkProject record);

    int insertSelective(WorkProject record);

    WorkProject selectByPrimaryKey(WorkProject key);

    int updateByPrimaryKeySelective(WorkProject record);

    int updateByPrimaryKey(WorkProject record);
}