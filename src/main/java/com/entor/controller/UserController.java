package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.User;
import com.entor.service.UserService;
import com.entor.util.Page;

@Controller
public class UserController {
	@Resource 
	private UserService userService;
	
	//admin_user_list/0/1  
	@RequestMapping("/admin_user_list/{cid}/{currentPage}")
	public String queryByPage(@PathVariable String cid, @PathVariable String currentPage,Map<String, Object> map) {
		int ccid = Integer.parseInt(cid);
		Page<User> page = new Page<>(currentPage,5,userService.getTotals(User.class));
		List<User> list= userService.queryByPage(User.class,page.getSp(),page.getPageSize());
		map.put("us", list);
		map.put("page", page);
		map.put("list", "admin_user_list");
		map.put("Cateid", ccid);
		return "admin/listUser";
	}
	
	@RequestMapping("/foreregister")
	public String addUser(User user, Map<String, Object>map,HttpSession session) {
		userService.add(user);
		map.put("user", user);
		session.setAttribute("user", user);
		//<meta http-equiv="refresh" content="等待秒数;url=页面路径"/>
		return "fore/registerSuccess";
	}
}
