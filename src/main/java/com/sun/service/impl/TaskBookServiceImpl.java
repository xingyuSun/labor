package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.TaskBookDao;
import com.sun.pojo.TaskBook;
import com.sun.service.TaskBookService;


@Service("TaskBookService")
public class TaskBookServiceImpl implements TaskBookService {

	@Resource
	private TaskBookDao TaskBookDao;
	
	@Override
	public boolean checkTaskBook(TaskBook TaskBook) {
		// TODO Auto-generated method stub
		if(this.TaskBookDao.checkTaskBook(TaskBook).isEmpty())
		   return true;
		else
		   return false;
	}
	
	@Override
	public List<Map<String, Object>> getTaskBook(String taskbooktype) {
		// TODO Auto-generated method stub
		return this.TaskBookDao.getTaskBook(taskbooktype);
	}
	
	@Override
	public List<Map<String, Object>> getTaskBookByUser(int userid) {
		// TODO Auto-generated method stub
		return this.TaskBookDao.getTaskBookByUser(userid);
	}
	
	@Override
	public List<Map<String, Object>> getTaskBookStatus(String reviewstatus) {
		// TODO Auto-generated method stub
		return this.TaskBookDao.getTaskBookStatus(reviewstatus);
	}
	
	@Override
	public List<Map<String, Object>> getTaskBookAll() {
		// TODO Auto-generated method stub
		return this.TaskBookDao.getTaskBookAll();
	}

	@Override
	public boolean changeTaskBook(TaskBook TaskBook) {
		// TODO Auto-generated method stub
			  if(this.TaskBookDao.changeTaskBook(TaskBook))
				return true;
			  else
				return false;
	}
	
	@Override
	public boolean reviewTaskBook(TaskBook TaskBook) {
		// TODO Auto-generated method stub
			  if(this.TaskBookDao.reviewTaskBook(TaskBook))
				return true;
			  else
				return false;
	}
	

	@Override
	public boolean deleteByPrimaryKey(TaskBook TaskBook) {
		// TODO Auto-generated method stub
		if(this.TaskBookDao.deleteByPrimaryKey(TaskBook))
			return true;
		else
			return false;
	}

	@Override
	public boolean insert(TaskBook TaskBook) {
		// TODO Auto-generated method stub
		if(checkTaskBook(TaskBook)){
		  if(this.TaskBookDao.insert(TaskBook))
			return true;
		  else
			return false;
		}
		else
		return false;
	}	
}
