package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.UnitDao;
import com.sun.pojo.UnitKey;
import com.sun.service.UnitService;


@Service("UnitService")
public class UnitServiceImpl implements UnitService {

	@Resource
	private UnitDao UnitDao;
	
	@Override
	public boolean checkUnit(UnitKey UnitKey) {
		// TODO Auto-generated method stub
		if(this.UnitDao.checkUnit(UnitKey)==null)
		   return true;
		else
		   return false;
	}
	
	@Override
	public boolean checkChange(UnitKey UnitKey) {
		// TODO Auto-generated method stub
		if(this.UnitDao.checkUnit(UnitKey)==null)
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getUnit() {
		// TODO Auto-generated method stub
		return this.UnitDao.getUnit();
	}

	@Override
	public boolean changeUnit(UnitKey UnitKey) {
		// TODO Auto-generated method stub
		if(checkChange(UnitKey)){
			  if(this.UnitDao.changeUnit(UnitKey))
				return true;
			  else
				return false;
			}
			else
			return false;
	}

	@Override
	public boolean deleteByPrimaryKey(UnitKey UnitKey) {
		// TODO Auto-generated method stub
		if(this.UnitDao.deleteByPrimaryKey(UnitKey))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(UnitKey UnitKey) {
		// TODO Auto-generated method stub
		if(checkUnit(UnitKey)){
		  if(this.UnitDao.insert(UnitKey))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
