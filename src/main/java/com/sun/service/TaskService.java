package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.SettlementUnitKey;
import com.sun.pojo.TaskKey;

public interface TaskService {

	public boolean checkTask(TaskKey TaskKey);
	
	public List<Map<String,Object>> getTask();
	
	public boolean changeTask(TaskKey TaskKey);
	
	public boolean deleteByPrimaryKey(TaskKey TaskKey);

	public boolean insert(TaskKey TaskKey);
		
}
