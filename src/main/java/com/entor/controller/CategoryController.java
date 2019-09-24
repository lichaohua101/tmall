package com.entor.controller;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
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
		map.put("list", "admin_listCategory");
		return "admin/listCategory";
	}
	//删除
	@RequestMapping("/admin_category_delete/{id}/{sp}")
	public String admin_category_delete(@PathVariable String id,@PathVariable String sp) {
		categoryService.deleteById(Category.class, id);
		return "forward:/admin_listCategory/"+sp;
	}
	//添加类别
	@RequestMapping("/admin_category_add")
	public String admin_category_add(String name,MultipartFile file ,HttpServletRequest request) throws IllegalStateException, IOException {
		Category category = new Category();
		category.setName(name);
		categoryService.add(category);
		System.out.println("类别名字"+name);
		String path = request.getServletContext().getRealPath("/img/category/");
		if (file!=null) {
			//文件类型
			String contentType =  file.getContentType();
			//文件名称
			String fileName = String.valueOf(category.getId());
			//文件大小
			long size =  file.getSize();
			System.out.println("文件类型"+contentType);
			System.out.println("文件名称"+fileName);
			System.out.println("文件大小"+size);
			System.out.println("文件地址"+path);
			file.transferTo(new File(path,fileName+".jpg"));
		}
		return "redirect:/admin_listCategory/1";
	}
}
