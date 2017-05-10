package com.sun.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pojo.User;
import com.sun.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
    public ModelAndView doAddUserUI(){
	return new ModelAndView("user/login");
   }
	
	
	@RequestMapping("/register")
	public ModelAndView Register()
	{
		return new ModelAndView("user/register");
	}
	
	@RequestMapping("/checklogin")
	public ModelAndView CheckLogin(User user,HttpSession session){
		System.out.println("成功"+user.getPassword());
		boolean flg=userService.userCheckUser(user);
		if(flg) {
			User u= userService.getUserByLoginName(user.getLoginname());
			String name=u.getLoginname(); 
			int ID = u.getUserid();			
			Map<String, String> map = new HashMap<String, String>();
			//map.put("userName", name);
			//map.put("userID", String.valueOf(ID));			
			//System.out.println(user.getLoginname());
			ModelAndView m = new ModelAndView("redirect:/systemmanage/rolerightsmanagement");
			//m.addObject("map", map);
			session.setAttribute("userID", String.valueOf(ID));
			session.setAttribute("userName", name);
			return m;
		}
		System.out.println("失败"+user.getPassword());
		return new ModelAndView("user/login");
	}
	
}