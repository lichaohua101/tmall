package com.entor.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Product;
import com.entor.service.ProductService;

@Controller
public class ProductController {
	
	@Resource
	private ProductService productService;
	
	@RequestMapping("/admin_listProduct")
	public String queryByPage(Map<String, Object> map) {
		List<Product> list = productService.queryByPage(Product.class, 1, 5);
		map.put("ps", list);
		return "admin/listProduct";
	}
	
	
}
