package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.SettlementUnitDao;
import com.sun.pojo.SettlementUnitKey;
import com.sun.service.SettlementUnitService;


@Service("SettlementUnitService")
public class SettlementUnitServiceImpl implements SettlementUnitService {

	@Resource
	private SettlementUnitDao SettlementUnitDao;
	
	@Override
	public boolean checkSettlementUnit(SettlementUnitKey SettlementUnitKey) {
		// TODO Auto-generated method stub
		if(this.SettlementUnitDao.checkSettlementUnit(SettlementUnitKey)==null)
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getSettlementUnit() {
		// TODO Auto-generated method stub
		return this.SettlementUnitDao.getSettlementUnit();
	}

	@Override
	public boolean changeSettlementUnit(SettlementUnitKey SettlementUnitKey) {
		// TODO Auto-generated method stub
		if(this.SettlementUnitDao.changeSettlementUnit(SettlementUnitKey))
		   return true;
	    else
		   return false;
	}

	@Override
	public boolean deleteByPrimaryKey(SettlementUnitKey SettlementUnitKey) {
		// TODO Auto-generated method stub
		if(this.SettlementUnitDao.deleteByPrimaryKey(SettlementUnitKey))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(SettlementUnitKey SettlementUnitKey) {
		// TODO Auto-generated method stub
		if(checkSettlementUnit(SettlementUnitKey)){
		  if(this.SettlementUnitDao.insert(SettlementUnitKey))
			return true;
		  else
			return false;
		}
		else
		return false;
	}

	
	
	
	
}
