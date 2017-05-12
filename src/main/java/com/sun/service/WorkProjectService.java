package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.WorkProject;

public interface WorkProjectService {

	public boolean checkWorkProject(WorkProject WorkProject);
	
	public boolean checkChange(WorkProject WorkProject);
	
	public List<Map<String,Object>> getWorkProject();
	
	public boolean changeWorkProject(WorkProject WorkProject);
	
	public boolean deleteByPrimaryKey(WorkProject WorkProject);

	public boolean insert(WorkProject WorkProject);
		
}