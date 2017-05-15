package com.sun.controller;

import java.io.IOException;
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
import com.sun.pojo.Project;
import com.sun.pojo.WorkProject;
import com.sun.pojo.SettlementUnitKey;
import com.sun.pojo.TaskKey;
import com.sun.pojo.UnitKey;
import com.sun.pojo.TaskBook;


import com.sun.service.BuildingsService;
import com.sun.service.DepartmentService;
import com.sun.service.DivisionService;
import com.sun.service.ProjectService;
import com.sun.service.SettlementUnitService;
import com.sun.service.TaskBookService;
import com.sun.service.TaskService;
import com.sun.service.UnitService;
import com.sun.service.WorkProjectService;





@Controller
@RequestMapping("/newtaskbook")
public class NewTaskBookController {
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
	
	
	
	@RequestMapping("/priceworktaskbook")
	public ModelAndView PriceWorkTaskBook(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("newtaskbook/priceworktaskbook");
		String taskbooktype="计件任务书";
		List<Map<String,Object>> mapList=taskBookService.getTaskBook(taskbooktype);
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
	
	@RequestMapping("/timingtaskbook")
	public ModelAndView TimingTaskBook(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("newtaskbook/timingtaskbook");
		String taskbooktype="计时任务书";
		List<Map<String,Object>> mapList=taskBookService.getTaskBook(taskbooktype);
		List<Map<String,Object>> mapListu=unitService.getUnit();
		List<Map<String,Object>> mapLists=settlementUnitService.getSettlementUnit();
		List<Map<String,Object>> mapListd=divisionService.getDivision();
		List<Map<String,Object>> mapListp=projectService.getProject();
		List<Map<String,Object>> mapListw=workProjectService.getWorkProject();
		List<Map<String,Object>> mapListt=departmentService.getDepartment();
		List<Map<String,Object>> mapListb=buildingsService.getBuildings();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
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
	
	@RequestMapping("/changevisataskbook")
	public ModelAndView ChangeVisaTaskBook(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("newtaskbook/changevisataskbook");
		String taskbooktype="变更签证任务书";
		List<Map<String,Object>> mapList=taskBookService.getTaskBook(taskbooktype);
		List<Map<String,Object>> mapListu=unitService.getUnit();
		List<Map<String,Object>> mapLists=settlementUnitService.getSettlementUnit();
		List<Map<String,Object>> mapListd=divisionService.getDivision();
		List<Map<String,Object>> mapListp=projectService.getProject();
		List<Map<String,Object>> mapListw=workProjectService.getWorkProject();
		List<Map<String,Object>> mapListt=departmentService.getDepartment();
		List<Map<String,Object>> mapListb=buildingsService.getBuildings();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
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
	
	@RequestMapping("/othertaskbook")
	public ModelAndView SupplyPriceTaskBook(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("newtaskbook/othertaskbook");
		String taskbooktype="合同内其他任务书";
		List<Map<String,Object>> mapList=taskBookService.getTaskBook(taskbooktype);
		List<Map<String,Object>> mapListu=unitService.getUnit();
		List<Map<String,Object>> mapLists=settlementUnitService.getSettlementUnit();
		List<Map<String,Object>> mapListd=divisionService.getDivision();
		List<Map<String,Object>> mapListp=projectService.getProject();
		List<Map<String,Object>> mapListw=workProjectService.getWorkProject();
		List<Map<String,Object>> mapListt=departmentService.getDepartment();
		List<Map<String,Object>> mapListb=buildingsService.getBuildings();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
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
	
	@RequestMapping(value="/addTaskBook",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddTaskBook(TaskBook TaskBook,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerights.setUserID(ID);
		System.out.println(TaskBook.getTaskbookid());
		System.out.println(TaskBook.getTaskbooktype());
		System.out.println(TaskBook.getTaskbookremarks());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(taskBookService.insert(TaskBook))
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
