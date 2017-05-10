package com.sun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.service.RoleService;
import com.sun.service.TaskService;



@Controller
@RequestMapping("/decorationinfo")
public class DecorationInfoController {

	@Resource
	private TaskService taskService;
	
	@RequestMapping("/taskbooktype")
	public ModelAndView TaskBookType(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/taskbooktype");
		System.out.println(ID);
		List<Map<String,Object>> mapList=taskService.getTask();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
//		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		return m;
	}
	
	@RequestMapping("/unit")
	public ModelAndView Unit(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/unit");
//		List<Map<String,Object>> mapList=roleService.getRole();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
//		m.addObject("nameAndID", nameAndID);
//		m.addObject("listMap", mapList);
		return m;
	}
	
	@RequestMapping("/settlementunit")
	public ModelAndView SettlementUnit(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("decorationinfo/settlementunit");
//		List<Map<String,Object>> mapList=roleService.getRole();
		System.out.println(ID);
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
