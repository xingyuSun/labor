package com.sun.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pojo.DivisionKey;
import com.sun.pojo.History;
import com.sun.pojo.Project;
import com.sun.pojo.WorkProject;
import com.sun.pojo.SettlementUnitKey;
import com.sun.pojo.TaskKey;
import com.sun.pojo.UnitKey;
import com.sun.pojo.TaskBook;


import com.sun.service.BuildingsService;
import com.sun.service.DepartmentService;
import com.sun.service.DivisionService;
import com.sun.service.HistoryService;
import com.sun.service.ProjectService;
import com.sun.service.SettlementUnitService;
import com.sun.service.TaskBookService;
import com.sun.service.TaskService;
import com.sun.service.UnitService;
import com.sun.service.WorkProjectService;

@Controller
@RequestMapping("/taskbookviewreview")
public class TaskBookViewReviewController {
	@Resource
	private TaskBookService taskBookService;
	@Resource
	private UnitService unitService;
	@Resource
	private SettlementUnitService settlementUnitService;
	@Resource
	private DivisionService divisionService;
	@Resource
	private ProjectService projectService;
	@Resource
	private WorkProjectService workProjectService;
	@Resource
	private DepartmentService departmentService;
	@Resource
	private BuildingsService buildingsService;
	@Resource
	private HistoryService historyService;
	
	
	
	@RequestMapping("/taskbookview")
	public ModelAndView TaskBookView(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("taskbookviewreview/taskbookview");
		List<Map<String,Object>> mapList=taskBookService.getTaskBookAll();

//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		return m;
	}
	
	@RequestMapping("/review")
	public ModelAndView Review(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		String role = String.valueOf(session.getAttribute("roleName"));
		ModelAndView m = new ModelAndView("taskbookviewreview/review");
		List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();
		if(role.equals("审计"))
		{
			mapList=taskBookService.getTaskBookStatus("工长审核通过");
		}
		else if(role.equals("项目经理"))
		{
			mapList=taskBookService.getTaskBookStatus("审计审核通过");
		}
		else if(role.equals("工长"))
		{
			mapList=taskBookService.getTaskBookStatus("待审核");
		}
		else
		{
			mapList=taskBookService.getTaskBookAll();
		}
		
//		for(int i=0;i<mapList.size();i++){
//		System.out.println(mapList.get(i).get("reviewStatus"));
//		System.out.println(mapList.get(i).get("reviewor"));
//	    }
		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		return m;
	}
	
	
	@RequestMapping("/retireunreviewtaskbook")
	public ModelAndView RetireUnreviewTaskBook(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		String role = String.valueOf(session.getAttribute("roleName"));
		ModelAndView m = new ModelAndView("taskbookviewreview/retireunreviewtaskbook");
		List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();

		if((role.equals("审计")||role.equals("工长")||role.equals("项目经理")))
		{
			mapList=taskBookService.getTaskBookAll();
		}
		else
		{
			mapList=taskBookService.getTaskBookAll();
		}
		
		List<Map<String,Object>> mapListu=unitService.getUnit();
		List<Map<String,Object>> mapLists=settlementUnitService.getSettlementUnit();
		List<Map<String,Object>> mapListd=divisionService.getDivision();
		List<Map<String,Object>> mapListp=projectService.getProject();
		List<Map<String,Object>> mapListw=workProjectService.getWorkProject();
		List<Map<String,Object>> mapListt=departmentService.getDepartment();
		List<Map<String,Object>> mapListb=buildingsService.getBuildings();
		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		m.addObject("listMapu", mapListu);
		m.addObject("listMaps", mapLists);
		m.addObject("listMapd", mapListd);
		m.addObject("listMapp", mapListp);
		m.addObject("listMapw", mapListw);
		m.addObject("listMapt", mapListt);
		m.addObject("listMapb", mapListb);
		return m;
	}
	
	
	@RequestMapping("/reviewhistory")
	public ModelAndView ReviewHistory(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("taskbookviewreview/reviewhistory");
		List<Map<String,Object>> mapList=historyService.getHistory();

		for(int i=0;i<mapList.size();i++){
			System.out.println(mapList.get(i).get("taskBookID"));
			System.out.println(mapList.get(i).get("historyTime"));
		}
		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		return m;
	}
	
	
	
	@RequestMapping(value="/doreview",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> review(TaskBook TaskBook,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		String name=(String)session.getAttribute("userName");
		String role = String.valueOf(session.getAttribute("roleName"));
		History history = new History();
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println(TaskBook.getTaskbookid());
		System.out.println(TaskBook.getReviewtime());
		System.out.println(TaskBook.getReviewresult());
		history.setTaskbookid(TaskBook.getTaskbookid());
		history.setHistorytime(TaskBook.getReviewtime());
		history.setHistoryor(name);
		historyService.insert(history);
		if(role.equals("审计")||role.equals("工长")||role.equals("项目经理")){
		    TaskBook.setReviewor(name);
		    if(TaskBook.getTaskbookremarks().equals("通过"))
	            TaskBook.setReviewstatus(role+"审核通过");
		    else
		    	TaskBook.setReviewstatus("退修");
	        if(taskBookService.reviewTaskBook(TaskBook))
	    	    map.put("success", "true");
	    	  else
		   	    map.put("success", "false");
		}
		else
		{
			map.put("success", "no");
		}
		return map;  
		
	}
	
	
	
	
	@RequestMapping(value="/changeTaskBook",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeTaskBook(TaskBook TaskBook,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerights.setUserID(ID);
		System.out.println(TaskBook.getTaskbookid());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(taskBookService.changeTaskBook(TaskBook))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}

	@RequestMapping(value="/deleteTaskBook",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteTaskBook(TaskBook TaskBook,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerights.setUserID(ID);
		System.out.println(TaskBook.getTaskbookid());
		System.out.println(TaskBook.getTaskbooktype());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(taskBookService.deleteByPrimaryKey(TaskBook))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	
	
	
	public Map<String,Object> getNameAndID(HttpSession session){
		String name = String.valueOf(session.getAttribute("userName"));
		int ID = Integer.valueOf(String.valueOf(session.getAttribute("userID")));
		Map<String,Object> nameAndID=new HashMap<String,Object>();
		nameAndID.put("userName", name);
		nameAndID.put("userID", ID);
		
		return nameAndID;
	}
}
