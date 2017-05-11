package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.SettlementUnitKey;
import com.sun.pojo.SettlementUnitKey;

public interface SettlementUnitDao {
	
	
	public SettlementUnitKey checkSettlementUnit(SettlementUnitKey SettlementUnitKey);
	
	public List<Map<String,Object>> getSettlementUnit();
	
	public boolean changeSettlementUnit(SettlementUnitKey SettlementUnitKey);
	
	
	
	boolean deleteByPrimaryKey(SettlementUnitKey key);

	boolean insert(SettlementUnitKey record);

    int insertSelective(SettlementUnitKey record);
}