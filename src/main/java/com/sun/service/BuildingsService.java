package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.BuildingsKey;

public interface BuildingsService {

	public boolean checkBuildings(BuildingsKey BuildingsKey);
	
	public boolean checkChange(BuildingsKey BuildingsKey);
	
	public List<Map<String,Object>> getBuildings();
	
	public boolean changeBuildings(BuildingsKey BuildingsKey);
	
	public boolean deleteByPrimaryKey(BuildingsKey BuildingsKey);

	public boolean insert(BuildingsKey BuildingsKey);
		
}

