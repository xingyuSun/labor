package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.TaskDao;
import com.sun.pojo.TaskKey;
import com.sun.service.TaskService;


@Service("TaskService")
public class TaskServiceImpl implements TaskService {

	@Resource
	private TaskDao TaskDao;
	
	@Override
	public boolean checkTask(TaskKey TaskKey) {
		// TODO Auto-generated method stub
		System.out.println(TaskKey.getTaskid());
		if(TaskDao.checkTask(TaskKey).isEmpty())
		{
		   return true;
		}
		else
		{
		   return false;
		}
	}
	
	@Override
	public boolean checkChange(TaskKey TaskKey) {
		// TODO Auto-generated method stub
		if(this.TaskDao.checkChange(TaskKey).isEmpty())
		   return true;
		else
		   return false;
	}

	@Override
	public List<Map<String, Object>> getTask() {
		// TODO Auto-generated method stub
		return this.TaskDao.getTask();
	}

	@Override
	public boolean changeTask(TaskKey TaskKey) {
		// TODO Auto-generated method stub
		if(checkChange(TaskKey)){
			  if(this.TaskDao.changeTask(TaskKey))
				return true;
			  else
				return false;
			}
			else
			return false;
		
		
	}
	
	

	@Override
	public boolean deleteByPrimaryKey(TaskKey TaskKey) {
		// TODO Auto-generated method stub
		if(this.TaskDao.deleteByPrimaryKey(TaskKey))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(TaskKey TaskKey) {
		// TODO Auto-generated method stub
		if(checkTask(TaskKey)){
		  if(this.TaskDao.insert(TaskKey))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
