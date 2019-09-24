package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.entor.entity.Category;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.util.Page;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryService categoryService;
	
	//分页
	@RequestMapping("/admin_listCategory/{currentPage}")
	public String queryByPage(@PathVariable String currentPage,Map<String, Object> map) {
		Page<User> page = new Page<>(currentPage,5,categoryService.getTotals(Category.class));
		List<Category> list= categoryService.queryByPage(Category.class,page.getSp(),page.getPageSize());
		map.put("cs", list);
		map.put("page", page);
		return "admin/listCategory";
	}
	//添加类别
	@RequestMapping("/admin_category_add")
	public String admin_category_add(String name,MultipartFile file ,HttpServletRequest request) {
		Category category = new Category();
		category.setName(name);
		categoryService.add(category);
		String path = request.getServletContext().getRealPath("/img/category/");
		
		return null;
	}
}
