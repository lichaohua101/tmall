package com.entor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.service.ProductImageService;

@Controller
public class ProductImageController {
	@Resource ProductImageService productImageService;
	
	
	@RequestMapping("/admin_productImage_list/{cid}/{sp}/{pid}")
	public String admin_productImage_list(@PathVariable String cid,@PathVariable String sp,@PathVariable String pid) {
		
		return "admin/editPropertyValue";
	}
}
