package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.dao.HistoryDao;
import com.sun.pojo.History;
import com.sun.service.HistoryService;

@Service("HistoryService")
public class HistoryServiceImpl implements HistoryService {

	@Resource
	private HistoryDao HistoryDao;
	@Override
	public boolean insert(History History) {
		// TODO Auto-generated method stub

		  if(this.HistoryDao.insert(History))
			return true;
		  else
			return false;
	}	
	
	
	@Override
	public List<Map<String, Object>> getHistory() {
		// TODO Auto-generated method stub
		return this.HistoryDao.getHistory();
	}
	
}
