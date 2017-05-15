package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.DepartmentKey;

public interface DepartmentService {

	public boolean checkDepartment(DepartmentKey DepartmentKey);
	
	public boolean checkChange(DepartmentKey DepartmentKey);
	
	public List<Map<String,Object>> getDepartment();
	
	public boolean changeDepartment(DepartmentKey DepartmentKey);
	
	public boolean deleteByPrimaryKey(DepartmentKey DepartmentKey);

	public boolean insert(DepartmentKey DepartmentKey);
		
}

