package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.TaskKey;

public interface TaskDao {
	
	
	public List<Map<String,Object>> checkTask(TaskKey TaskKey);
	
	public List<Map<String,Object>> checkChange(TaskKey TaskKey);
	
	public List<Map<String,Object>> getTask();
	
	public boolean changeTask(TaskKey TaskKey);
	
	boolean deleteByPrimaryKey(TaskKey key);

	boolean insert(TaskKey record);

    int insertSelective(TaskKey record);
}