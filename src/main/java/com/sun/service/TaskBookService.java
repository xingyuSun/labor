package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.TaskBook;

public interface TaskBookService {

	public boolean checkTaskBook(TaskBook TaskBook);
	
	public List<Map<String,Object>> getTaskBook(String s);
	
	public List<Map<String,Object>> getTaskBookByUser(int s);
	
	public List<Map<String,Object>> getTaskBookStatus(String s);
	
	public List<Map<String,Object>> getTaskBookAll();
	
	public boolean reviewTaskBook(TaskBook TaskBook);
	
	public boolean changeTaskBook(TaskBook TaskBook);
	
	public boolean deleteByPrimaryKey(TaskBook TaskBook);

	public boolean insert(TaskBook TaskBook);
		
}
