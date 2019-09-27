package com.entor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Category;
import com.entor.entity.Product;
import com.entor.entity.PropertyValueVO;
import com.entor.service.CategoryService;
import com.entor.service.ProductService;
import com.entor.service.PropertyValueService;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@Controller
public class PropertyValueController {
	@Resource
	private CategoryService categoryService;
	@Resource
	private ProductService productService;
	@Resource
	private PropertyValueService pvs;
	
	//				  admin_propertyValue_edit/60/1/958
	@RequestMapping("/admin_propertyValue_edit/{cid}/{sp}/{pid}")
	public String admin_propertyValue_edit(@PathVariable String cid,@PathVariable String sp,@PathVariable String pid, Map<String,Object>map) {
		Category category =  categoryService.queryById(Category.class, Integer.parseInt(cid));
		Product product = productService.queryById(Product.class, Integer.parseInt(pid));
		//List<PropertyValueVO> list =  propertyValueService.queryAllByPid(Integer.parseInt(pid));
		List<PropertyValueVO> list = pvs.queryAllByPid(Integer.parseInt(pid));
		map.put("c", category);
		map.put("p", product);
		map.put("pvs", list);
		return "admin/editPropertyValue";
	}
	@RequestMapping("/admin_propertyValue_update")
	public void updateForm(String pvid,String value,HttpServletRequest request,HttpServletResponse response) throws IOException{
				pvs.updateValueById(value, pvid);
				PrintWriter out = response.getWriter();
				out.write("success");
				out.flush();
				out.close();
	}
}
