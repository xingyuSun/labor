package com.sun.service;


import com.sun.pojo.UnitKey;
import java.util.List;
import java.util.Map;

public interface UnitService {

	public boolean checkUnit(UnitKey UnitKey);
	
	public List<Map<String,Object>> getUnit();
	
	public boolean changeUnit(UnitKey UnitKey);
	
	public boolean deleteByPrimaryKey(UnitKey UnitKey);

	public boolean insert(UnitKey UnitKey);
		
}

