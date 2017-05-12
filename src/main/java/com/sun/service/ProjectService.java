package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.Project;

public interface ProjectService {

	public boolean checkProject(Project Project);
	
	public boolean checkChange(Project Project);
	
	public List<Map<String,Object>> getProject();
	
	public boolean changeProject(Project Project);
	
	public boolean deleteByPrimaryKey(Project Project);

	public boolean insert(Project Project);
		
}

