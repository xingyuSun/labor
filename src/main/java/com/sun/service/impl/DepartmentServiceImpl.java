package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.DepartmentDao;
import com.sun.pojo.DepartmentKey;
import com.sun.service.DepartmentService;


@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentDao DepartmentDao;
	
	@Override
	public boolean checkDepartment(DepartmentKey DepartmentKey) {
		// TODO Auto-generated method stub
		if(this.DepartmentDao.checkDepartment(DepartmentKey).isEmpty())
		   return true;
		else
		   return false;
	}
	
	@Override
	public boolean checkChange(DepartmentKey DepartmentKey) {
		// TODO Auto-generated method stub
		if(this.DepartmentDao.checkChange(DepartmentKey).isEmpty())
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getDepartment() {
		// TODO Auto-generated method stub
		return this.DepartmentDao.getDepartment();
	}

	@Override
	public boolean changeDepartment(DepartmentKey DepartmentKey) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println(DepartmentKey.getDepartmentname());
		if(checkChange(DepartmentKey)){
			System.out.println("2");		
			  if(this.DepartmentDao.changeDepartment(DepartmentKey))
				return true;
			  else
				return false;
			}
			else
			return false;
		
		
	}
	
	

	@Override
	public boolean deleteByPrimaryKey(DepartmentKey DepartmentKey) {
		// TODO Auto-generated method stub
		if(this.DepartmentDao.deleteByPrimaryKey(DepartmentKey))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(DepartmentKey DepartmentKey) {
		// TODO Auto-generated method stub
		if(checkDepartment(DepartmentKey)){
		  if(this.DepartmentDao.insert(DepartmentKey))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
