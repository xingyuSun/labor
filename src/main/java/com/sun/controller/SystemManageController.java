package com.sun.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pojo.Role;
import com.sun.pojo.User;
import com.sun.pojo.rolerightsKey;
import com.sun.service.RoleService;
import com.sun.service.RoleRightsService;
import com.sun.service.UserService;



@Controller
@RequestMapping("/systemmanage")
public class SystemManageController {
	@Resource
	private RoleService roleService;
	@Resource
	private UserService userService;	
	@Resource
	private RoleRightsService roleRightsService;
	
	@RequestMapping("/usermanagement")
	public ModelAndView UserManagement(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("systemmanage/usermanagement");
		List<Map<String,Object>> mapList=userService.getUser();
		List<Map<String,Object>> mapListr=roleService.getRole();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		m.addObject("listMapr", mapListr);
		return m; 
	}
	
	@RequestMapping(value="/deleteUser",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteUser(User User,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(User.getUserid());
		System.out.println(User.getUsername());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(userService.deleteByPrimaryKey(User))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addUser",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddUser(User User,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(User.getUserid());
		System.out.println(User.getUsername());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(userService.insert(User))
	    	map.put("success", "true");
		else
			map.put("success", "false");	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeUser",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeUser(User User,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(User.getUserid());
		System.out.println(User.getUsername());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(userService.changeUser(User))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}
	
	
	@RequestMapping("/rolemanagement")
	public ModelAndView RoleManagement(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("systemmanage/rolemanagement");
		List<Map<String,Object>> mapList=roleService.getRole();
//		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//		}
		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		return m;
	}
	
	
	@RequestMapping(value="/deleteRole",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteRole(Role Role,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(Role.getRoleid());
		System.out.println(Role.getRolename());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(roleService.deleteByPrimaryKey(Role))
	    	map.put("success", "true");
		else
			map.put("success", "false");
		return map;  
		
	}
	
	@RequestMapping(value="/addRole",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doAddRole(Role Role,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(Role.getRoleid());
		System.out.println(Role.getRolename());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(roleService.insert(Role))
	    	map.put("success", "true");
		else
			map.put("success", "false");	   	    
		return map;  
		
	}
	
	@RequestMapping(value="/changeRole",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doChangeRole(Role Role,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(Role.getRoleid());
		System.out.println(Role.getRolename());
		Map<String,Object> map = new HashMap<String,Object>();
	    if(roleService.changeRole(Role))
	    	map.put("success", "true");
		else
			map.put("success", "false");
	   	    
		return map;  
		
	}

	
	
	@RequestMapping("/rolerightsmanagement")
	public ModelAndView RoleRightsManagement(HttpSession session){
		Map nameAndID=getNameAndID(session);
		int ID = Integer.valueOf(String.valueOf(nameAndID.get("userID")));
		ModelAndView m = new ModelAndView("systemmanage/rolerightsmanagement");
		List<Map<String,Object>> mapList=roleRightsService.getRoleRights();
		List<Map<String,Object>> mapLists=roleRightsService.getRights();
		List<Map<String,Object>> mapListr=roleService.getRole();
		for(int i=0;i<mapList.size();i++){
//			System.out.println(mapList.get(i).get("roleID"));
//			System.out.println(mapList.get(i).get("roleName"));
//			System.out.println(mapList.get(i).get("rightsID"));			
//			System.out.println(mapList.get(i).get("rightsName"));
		}
		m.addObject("nameAndID", nameAndID);
		m.addObject("listMap", mapList);
		m.addObject("listMaps", mapLists);
		m.addObject("listMapr", mapListr);
		return m;
	}
	
	@RequestMapping(value="/deleteRolerights",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> doDeleteRolerights(rolerightsKey rolerightsKey,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		System.out.println(rolerightsKey.getRoleid());
		System.out.println(rolerightsKey.getRightsid());
		Map<String,Object> map = new HashMap<String,Object>();
		if(roleRightsService.deleteRoleRights(rolerightsKey))
		{
			map.put("success", "true");
		} 
		else
		{
			map.put("success", "false");
		}
		return map;  
		
//		ModelAndView m = new ModelAndView("redirect:/systemmanage/rolerightsmanagement");
//		return m;
//		if(service.addIncomeAndExpenditure(incomeAndExpenditure))
//		{
//			map.put("success", "true");
//		} 

	}
	
	@RequestMapping(value="/addRolerights",produces="application/json;charset=UTF-8")
	@ResponseBody
	public ModelAndView doAddRolerights(HttpServletRequest request,HttpSession session) throws IOException{
		String id=(String)session.getAttribute("userID");
		int ID=Integer.parseInt(id);
		//rolerightsKey.setUserID(ID);
		ModelAndView m = new ModelAndView("redirect:/systemmanage/rolerightsmanagement");
		String rolename =new String((request.getParameter("rolename")).getBytes("iso-8859-1"),"utf-8");
		String rightsname =new String((request.getParameter("rightsname")).getBytes("iso-8859-1"),"utf-8");
		rolerightsKey rolerights=new rolerightsKey();
		rolerights.setRoleid(roleService.getIDByName(rolename));
		rolerights.setRightsid(roleRightsService.getIDByName(rightsname));
		//System.out.println(rolerights.getRoleid());
	    if(roleRightsService.insertRoleRights(rolerights))
	    {
	    	m.addObject("insert", true);
		    return m;
	    }
	    else
	    {
	    	m.addObject("insert", false);
	    	return m;
	    }
	
	}
	
	
	@RequestMapping(value="/getRole",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> getRole(HttpSession session) throws IOException{
		//System.out.println(category.getCategoryLevel());
		//System.out.println(category.getCategoryName());
		//System.out.println(category.getCategoryUpper());
		System.out.println("nima");
		String id=(String)session.getAttribute("userID");
		System.out.println(id);
	//	int ID=Integer.parseInt(id);
		//Role.setUserID(ID);
		Map<String,Object> map = new HashMap<String,Object>();
		//boolean flg=service.checkAccountName(incomeAndExpenditure);
		List<Map<String,Object>> mapList=roleService.getRole();
		for(int i=0;i<mapList.size();i++){
			//System.out.println(mapList.get(i).get("roleID"));
			//System.out.println(mapList.get(i).get("roleName"));
		}
		map.put("data",mapList);
		/*if(service.getRole(ID))
		{
			map.put("success", "true");
		} 
		else
		{
			map.put("success", "false");
		}*/
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
