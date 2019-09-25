package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

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
	
	@RequestMapping("/admin_listUser/{currentPage}")
	public String queryByPage(@PathVariable String currentPage,Map<String, Object> map) {
		Page<User> page = new Page<>(currentPage,5,userService.getTotals(User.class));
		List<User> list= userService.queryByPage(User.class,page.getSp(),page.getPageSize());
		map.put("us", list);
		map.put("page", page);
		map.put("list", "admin_listUser");
		return "admin/listUser";
	}
}
