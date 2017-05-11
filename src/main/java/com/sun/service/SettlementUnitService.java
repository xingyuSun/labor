package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.SettlementUnitKey;

public interface SettlementUnitService {

	public boolean checkSettlementUnit(SettlementUnitKey SettlementUnitKey);
	
	public boolean checkChange(SettlementUnitKey SettlementUnitKey);
	
	public List<Map<String,Object>> getSettlementUnit();
	
	public boolean changeSettlementUnit(SettlementUnitKey SettlementUnitKey);
	
	public boolean deleteByPrimaryKey(SettlementUnitKey SettlementUnitKey);

	public boolean insert(SettlementUnitKey SettlementUnitKey);
		
}