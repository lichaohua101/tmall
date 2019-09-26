package com.entor.controller;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.entor.entity.Category;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.util.Page;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryService categoryService;
	
	//分页  			  admin_category_list/0/1		
	@RequestMapping("/admin_listCategory/{cid}/{currentPage}")
	public String queryByPage(@PathVariable String cid, @PathVariable String currentPage,Map<String, Object> map) {
		Page<User> page = new Page<>(currentPage,5,categoryService.getTotals(Category.class));
		List<Category> list= categoryService.queryByPage(Category.class,page.getSp(),page.getPageSize());
		map.put("cs", list);
		map.put("page", page);
		map.put("list", "admin_listCategory");
		map.put("Cateid", cid);
		return "admin/listCategory";
	}
	//删除
	@RequestMapping("/admin_category_delete/{id}/{sp}")
	public String admin_category_delete(@PathVariable String id,@PathVariable String sp) {
		categoryService.deleteById(Category.class, id);
		return "forward:/admin_listCategory/0/"+sp;
	}
	//修改/admin_category_edit/60/1
	@RequestMapping("/admin_category_edit/{id}/{sp}")
	public String admin_category_edit(@PathVariable String id ,@PathVariable String sp, Map<String, Object> map){
		Category category =  categoryService.queryById(Category.class, Integer.parseInt(id));
		map.put("c", category);
		map.put("sp", sp);
		return "admin/editCategory";
		//admin_category_update
	}
	@RequestMapping("/admin_category_update")
	public String admin_category_update(MultipartFile file,HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sp = request.getParameter("sp");
		Category category = new Category();
		category.setId(Integer.parseInt(id));
		category.setName(name);
		System.out.println("类别名字"+name);
		categoryService.update(category);
		//E:\前端\apache-tomcat-9.0.6\webapps\tmall_ssm\img\category
		//C:\Users\Administrator\Workspaces\MyEclipse 10\tmall_ssm\src\main\webapp\img\category
		//相对地址（服务器）
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
		return "redirect:/admin_listCategory/0/"+sp;
		//return "redirect:/download?sp="+sp+"$file=+"+file;
	}
	/*//下载
	@RequestMapping("/download")
	@ResponseBody
	public String download3(HttpServletRequest request,HttpServletResponse response,String fileName) throws IOException {
		String sp = request.getParameter("sp");
		String path = request.getServletContext().getRealPath("/upload/");
		File file = new File(path,fileName);
		response.setContentType("application/x-msdownload");
		response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(fileName,"utf-8"));
        response.setHeader("Content-Length", String.valueOf(file.length()));
		Files.copy(file.toPath(), response.getOutputStream());
		return "redirect:/admin_listCategory/0/"+sp;
	}*/
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
		return "redirect:/admin_listCategory/0/1";
	}
}
