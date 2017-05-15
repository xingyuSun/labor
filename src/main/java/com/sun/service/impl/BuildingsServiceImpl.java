package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.BuildingsDao;
import com.sun.pojo.BuildingsKey;
import com.sun.service.BuildingsService;


@Service("BuildingsService")
public class BuildingsServiceImpl implements BuildingsService {

	@Resource
	private BuildingsDao BuildingsDao;
	
	@Override
	public boolean checkBuildings(BuildingsKey BuildingsKey) {
		// TODO Auto-generated method stub
		if(this.BuildingsDao.checkBuildings(BuildingsKey).isEmpty())
		   return true;
		else
		   return false;
	}
	
	@Override
	public boolean checkChange(BuildingsKey BuildingsKey) {
		// TODO Auto-generated method stub
		if(this.BuildingsDao.checkChange(BuildingsKey).isEmpty())
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getBuildings() {
		// TODO Auto-generated method stub
		return this.BuildingsDao.getBuildings();
	}

	@Override
	public boolean changeBuildings(BuildingsKey BuildingsKey) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println(BuildingsKey.getBuildingsnum());
		if(checkChange(BuildingsKey)){
			System.out.println("2");		
			  if(this.BuildingsDao.changeBuildings(BuildingsKey))
				return true;
			  else
				return false;
			}
			else
			return false;
		
		
	}
	
	

	@Override
	public boolean deleteByPrimaryKey(BuildingsKey BuildingsKey) {
		// TODO Auto-generated method stub
		if(this.BuildingsDao.deleteByPrimaryKey(BuildingsKey))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(BuildingsKey BuildingsKey) {
		// TODO Auto-generated method stub
		if(checkBuildings(BuildingsKey)){
		  if(this.BuildingsDao.insert(BuildingsKey))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
