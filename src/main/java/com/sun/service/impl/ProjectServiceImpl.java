package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.ProjectDao;
import com.sun.pojo.Project;
import com.sun.service.ProjectService;


@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {

	@Resource
	private ProjectDao ProjectDao;
	
	@Override
	public boolean checkProject(Project Project) {
		// TODO Auto-generated method stub
		if(this.ProjectDao.checkProject(Project).isEmpty())
		   return true;
		else
		   return false;
	}
	
	@Override
	public boolean checkChange(Project Project) {
		// TODO Auto-generated method stub
		if(this.ProjectDao.checkChange(Project).isEmpty())
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getProject() {
		// TODO Auto-generated method stub
		return this.ProjectDao.getProject();
	}

	@Override
	public boolean changeProject(Project Project) {
		// TODO Auto-generated method stub
		if(checkChange(Project)){
			  if(this.ProjectDao.changeProject(Project))
				return true;
			  else
				return false;
			}
			else
			return false;
		
		
	}
	
	

	@Override
	public boolean deleteByPrimaryKey(Project Project) {
		// TODO Auto-generated method stub
		if(this.ProjectDao.deleteByPrimaryKey(Project))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(Project Project) {
		// TODO Auto-generated method stub
		if(checkProject(Project)){
		  if(this.ProjectDao.insert(Project))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
