package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Category;
import com.entor.entity.Product;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.service.ProductService;
import com.entor.util.Page;

@Controller
public class ProductController {
	
	@Resource
	private ProductService productService;
	@Resource
	private CategoryService categoryService ;
	
	//统一类别的商品分页admin_product_list/91/1
	@RequestMapping("/admin_product_list/{cid}/{currentPage}")
	public String queryByPage(@PathVariable String cid, @PathVariable String currentPage, Map<String, Object> map) {
		int pageSize = productService.getByCidTotals(Integer.parseInt(cid));
		Page<Product> page = new Page<>(currentPage, 5,pageSize );
		List<Product> list = productService.queryByCidPage(Integer.parseInt(cid), page.getSp(),page.getPageSize());
		Category category =  categoryService.queryById(Category.class, Integer.parseInt(cid));
		map.put("ps", list);
		map.put("page", page);
		map.put("list", "admin_product_list");
		map.put("c", category);
		map.put("Cateid", cid);
		return "admin/listProduct";
	}
	//删除
	@RequestMapping("/admin_product_delete/{id}/{sp}/{cid}")
	public String admin_product_delete(@PathVariable String id,@PathVariable String sp,@PathVariable String cid) {
		productService.deleteById(Product.class, id);
		return "forward:/admin_listProduct/"+cid+"/"+sp;
	}
	
}
