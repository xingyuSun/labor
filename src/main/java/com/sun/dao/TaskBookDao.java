package com.sun.dao;

import java.util.List;
import java.util.Map;

import com.sun.pojo.TaskBook;

public interface TaskBookDao {
	public List<Map<String,Object>> checkTaskBook(TaskBook TaskBook);
		
	public List<Map<String,Object>> getTaskBook(String s);
	
	public List<Map<String,Object>> getTaskBookStatus(String s);
	
	public List<Map<String,Object>> getTaskBookAll();
	
	public boolean changeTaskBook(TaskBook TaskBook);
	
	public boolean reviewTaskBook(TaskBook TaskBook);
	
	boolean deleteByPrimaryKey(TaskBook key);

	boolean insert(TaskBook record);

    int insertSelective(TaskBook record);

    TaskBook selectByPrimaryKey(Integer taskbookid);

    int updateByPrimaryKeySelective(TaskBook record);

}