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

import com.sun.pojo.TaskKey;
import com.sun.pojo.UnitKey;
import com.sun.pojo.rolerightsKey;
import com.sun.service.RoleService;
import com.sun.service.SettlementUnitService;
import com.sun.service.TaskService;
import com.sun.service.UnitService;



@Controller
@RequestMapping("/decorationinfo")
public class DecorationInfoController {

	@Resource
	private TaskService taskService;
	@Resource
	private UnitService unitService;
	@Resource
	private SettlementUnitService settlementUnitService;
	
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
//		List<Map<String,Object>> mapList=roleService.getRole();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
//		m.addObject("nameAndID", nameAndID);
//		m.addObject("listMap", mapList);
		return m;
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
