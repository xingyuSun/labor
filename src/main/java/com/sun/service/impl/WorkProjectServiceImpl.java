package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.WorkProjectDao;
import com.sun.pojo.WorkProject;
import com.sun.service.WorkProjectService;


@Service("WorkProjectService")
public class WorkProjectServiceImpl implements WorkProjectService {

	@Resource
	private WorkProjectDao WorkProjectDao;
	
	@Override
	public boolean checkWorkProject(WorkProject WorkProject) {
		// TODO Auto-generated method stub
		if(this.WorkProjectDao.checkWorkProject(WorkProject).isEmpty())
		   return true;
		else
		   return false;
	}
	
	@Override
	public boolean checkChange(WorkProject WorkProject) {
		// TODO Auto-generated method stub
		if(this.WorkProjectDao.checkChange(WorkProject).isEmpty())
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getWorkProject() {
		// TODO Auto-generated method stub
		return this.WorkProjectDao.getWorkProject();
	}

	@Override
	public boolean changeWorkProject(WorkProject WorkProject) {
		// TODO Auto-generated method stub
		if(checkChange(WorkProject)){
			  if(this.WorkProjectDao.changeWorkProject(WorkProject))
				return true;
			  else
				return false;
			}
			else
			return false;
		
		
	}
	
	

	@Override
	public boolean deleteByPrimaryKey(WorkProject WorkProject) {
		// TODO Auto-generated method stub
		if(this.WorkProjectDao.deleteByPrimaryKey(WorkProject))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(WorkProject WorkProject) {
		// TODO Auto-generated method stub
		if(checkWorkProject(WorkProject)){
		  if(this.WorkProjectDao.insert(WorkProject))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
