package com.sun.service;

import java.util.List;
import java.util.Map;

import com.sun.pojo.History;

public interface HistoryService {

    boolean insert(History record);
	
	public List<Map<String,Object>> getHistory();
	
}
