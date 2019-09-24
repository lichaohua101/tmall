package com.entor.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.entity.Category;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.service.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService service =  (UserService) context.getBean("userService");
//		User user = service.queryById(User.class, 3);
//		System.out.println(user);
		
		CategoryService categoryService = (CategoryService) context.getBean("categoryService");
//		System.out.println(categoryService.queryById(Category.class, 60));
		
		List<Category> list = categoryService.queryByPage(Category.class, 1, 6);
		for (Category c : list) {
			System.out.println(c);
		}
		
	}
}
