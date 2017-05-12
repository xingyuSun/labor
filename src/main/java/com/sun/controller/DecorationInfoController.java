package com.sun.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pojo.DivisionKey;
import com.sun.pojo.Project;
import com.sun.pojo.WorkProject;
import com.sun.pojo.SettlementUnitKey;
import com.sun.pojo.TaskKey;
import com.sun.pojo.UnitKey;
import com.sun.pojo.rolerightsKey;
import com.sun.service.DivisionService;
import com.sun.service.ProjectService;
import com.sun.service.RoleService;
import com.sun.service.SettlementUnitService;
import com.sun.service.TaskService;
import com.sun.service.UnitService;
import com.sun.service.WorkProjectService;



@Controller
@RequestMapping("/decorationinfo")
public class DecorationInfoController {

	@Resource
	private TaskService taskService;
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
	
	
	
	@RequestMapping("/taskbooktype")
	public ModelAndView TaskBookType(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/taskbooktype");
		List<Map<String,Object>> mapList=taskService.getTask();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
//		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		return m;
	}
	
	@RequestMapping(value="/deleteTask",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteTask(TaskKey TaskKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(TaskKey.getTaskid());
		System.out.println(TaskKey.getTaskname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(taskService.deleteByPrimaryKey(TaskKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addTask",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddTask(TaskKey TaskKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(TaskKey.getTaskid());
		System.out.println(TaskKey.getTaskname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(taskService.insert(TaskKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeTask",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeTask(TaskKey TaskKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(TaskKey.getTaskid());
		System.out.println(TaskKey.getTaskname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(taskService.changeTask(TaskKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	
	
	
	@RequestMapping("/unit")
	public ModelAndView Unit(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/unit");
		List<Map<String,Object>> mapList=unitService.getUnit();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
//		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		return m;
	}
	
	@RequestMapping(value="/deleteUnit",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteUnit(UnitKey UnitKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(UnitKey.getUnitid());
		System.out.println(UnitKey.getUnitname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(unitService.deleteByPrimaryKey(UnitKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addUnit",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddUnit(UnitKey UnitKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(UnitKey.getUnitid());
		System.out.println(UnitKey.getUnitname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(unitService.insert(UnitKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeUnit",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeUnit(UnitKey UnitKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(UnitKey.getUnitid());
		System.out.println(UnitKey.getUnitname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(unitService.changeUnit(UnitKey))
	    	map.put("success", "true");
	    
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}

	
	
	
	
	
	
	@RequestMapping("/settlementunit")
	public ModelAndView SettlementUnit(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/settlementunit");
		List<Map<String,Object>> mapList=settlementUnitService.getSettlementUnit();
		m.addObject("listMap", mapList);
		return m;
	}
	
	
	
	@RequestMapping(value="/deleteSettlementUnit",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteSettlementUnit(SettlementUnitKey SettlementUnitKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(SettlementUnitKey.getSettlementunitid());
		System.out.println(SettlementUnitKey.getSettlementunitname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(settlementUnitService.deleteByPrimaryKey(SettlementUnitKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addSettlementUnit",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddSettlementUnit(SettlementUnitKey SettlementUnitKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(SettlementUnitKey.getSettlementunitid());
		System.out.println(SettlementUnitKey.getSettlementunitname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(settlementUnitService.insert(SettlementUnitKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeSettlementUnit",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeSettlementUnit(SettlementUnitKey SettlementUnitKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(SettlementUnitKey.getSettlementunitid());
		System.out.println(SettlementUnitKey.getSettlementunitname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(settlementUnitService.changeSettlementUnit(SettlementUnitKey))
	    	map.put("success", "true");
	    
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	
	
	@RequestMapping("/divisionstandard(d)")
	public ModelAndView Division(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/divisionstandard(d)");
		List<Map<String,Object>> mapList=divisionService.getDivision();
		m.addObject("listMap", mapList);
		return m;
	}
	
	
	
	@RequestMapping(value="/deleteDivision",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteDivision(DivisionKey DivisionKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(DivisionKey.getDivisionid());
		System.out.println(DivisionKey.getDivisionname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(divisionService.deleteByPrimaryKey(DivisionKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addDivision",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddDivision(DivisionKey DivisionKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(DivisionKey.getDivisionid());
		System.out.println(DivisionKey.getDivisionname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(divisionService.insert(DivisionKey))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeDivision",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeDivision(DivisionKey DivisionKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(DivisionKey.getDivisionid());
		System.out.println(DivisionKey.getDivisionname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(divisionService.changeDivision(DivisionKey))
	    	map.put("success", "true");	    
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}

	
	
	
	
	@RequestMapping("/project")
	public ModelAndView Project(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/project");
		List<Map<String,Object>> mapList=projectService.getProject();
		m.addObject("listMap", mapList);
		return m;
	}
	
	
	
	@RequestMapping(value="/deleteProject",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteProject(Project Project,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(Project.getProjectid());
		System.out.println(Project.getProjectname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(projectService.deleteByPrimaryKey(Project))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addProject",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddProject(Project Project,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(Project.getProjectid());
		System.out.println(Project.getProjectname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(projectService.insert(Project))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeProject",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeProject(Project Project,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(Project.getProjectid());
		System.out.println(Project.getProjectname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(projectService.changeProject(Project))
	    	map.put("success", "true");
	    
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}

	

	@RequestMapping("/workProject")
	public ModelAndView WorkProject(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/workProject");
		List<Map<String,Object>> mapList=workProjectService.getWorkProject();
		m.addObject("listMap", mapList);
		return m;
	}
	
	
	
	@RequestMapping(value="/deleteWorkProject",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteWorkProject(WorkProject WorkProject,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(WorkProject.getWorkprojectid());
		System.out.println(WorkProject.getWorkprojectname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(workProjectService.deleteByPrimaryKey(WorkProject))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addWorkProject",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddWorkProject(WorkProject WorkProject,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(WorkProject.getWorkprojectid());
		System.out.println(WorkProject.getWorkprojectname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(workProjectService.insert(WorkProject))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeWorkProject",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeWorkProject(WorkProject WorkProject,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(WorkProject.getWorkprojectid());
		System.out.println(WorkProject.getWorkprojectname());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(workProjectService.changeWorkProject(WorkProject))
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
