package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.DivisionDao;
import com.sun.pojo.DivisionKey;
import com.sun.service.DivisionService;


@Service("DivisionService")
public class DivisionServiceImpl implements DivisionService {

	@Resource
	private DivisionDao DivisionDao;
	
	@Override
	public boolean checkDivision(DivisionKey DivisionKey) {
		// TODO Auto-generated method stub
		if(this.DivisionDao.checkDivision(DivisionKey).isEmpty())
		   return true;
		else
		   return false;
	}
	
	@Override
	public boolean checkChange(DivisionKey DivisionKey) {
		// TODO Auto-generated method stub
		if(this.DivisionDao.checkChange(DivisionKey).isEmpty())
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getDivision() {
		// TODO Auto-generated method stub
		return this.DivisionDao.getDivision();
	}

	@Override
	public boolean changeDivision(DivisionKey DivisionKey) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println(DivisionKey.getDivisionname());
		if(checkChange(DivisionKey)){
			System.out.println("2");		
			  if(this.DivisionDao.changeDivision(DivisionKey))
				return true;
			  else
				return false;
			}
			else
			return false;
		
		
	}
	
	

	@Override
	public boolean deleteByPrimaryKey(DivisionKey DivisionKey) {
		// TODO Auto-generated method stub
		if(this.DivisionDao.deleteByPrimaryKey(DivisionKey))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(DivisionKey DivisionKey) {
		// TODO Auto-generated method stub
		if(checkDivision(DivisionKey)){
		  if(this.DivisionDao.insert(DivisionKey))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
