package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.DivisionKey;

public interface DivisionService {

	public boolean checkDivision(DivisionKey DivisionKey);
	
	public boolean checkChange(DivisionKey DivisionKey);
	
	public List<Map<String,Object>> getDivision();
	
	public boolean changeDivision(DivisionKey DivisionKey);
	
	public boolean deleteByPrimaryKey(DivisionKey DivisionKey);

	public boolean insert(DivisionKey DivisionKey);
		
}

