package com.entor.controller;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.entor.service.ProductImageService;
import com.entor.service.ProductService;
import com.entor.util.Page;

@Controller
public class ProductController {
	
	@Resource
	private ProductService productService;
	@Resource
	private CategoryService categoryService ;
	@Resource
	private ProductImageService productImageService;
	
	//统一类别的商品分页     admin_product_list/60/2
  //@RequestMapping("/admin_listCategory/{cid}/{currentPage}")
	@RequestMapping("/admin_product_list/{cid}/{currentPage}")
	public String queryByPage(@PathVariable String cid, @PathVariable String currentPage, Map<String, Object> map) {
		int pageSize = productService.getByCidTotals(Integer.parseInt(cid));
		Page<Product> page = new Page<>(currentPage, 5,pageSize);
		List<Product> list = productService.queryByCidPage(Integer.parseInt(cid), page.getSp(),page.getPageSize());
		Category category =  categoryService.queryById(Category.class, Integer.parseInt(cid));
		
		/*List<Integer> list2  = new ArrayList<>();
		for (Product p : list) {
			list2.add(productImageService.getScondImage(Integer.parseInt(cid),p.getId()));
		}
		map.put("pimage", list2);*/
		
		map.put("pimage", 10202);
		map.put("ps", list);
		map.put("list", "admin_product_list");
		map.put("c", category);
		map.put("Cateid",cid);
		map.put("page", page);
		return "admin/listProduct";
	}
	//删除			  admin_product_delete/60/3/979
	@RequestMapping("/admin_product_delete/{cid}/{sp}/{pid}")
	public String admin_product_delete(@PathVariable String cid,@PathVariable String sp,@PathVariable String pid) {
		productService.deleteById(Product.class, Integer.parseInt(pid));
		return "redirect:/admin_product_list/"+Integer.parseInt(cid)+"/"+Integer.parseInt(sp);
	}
	//新增/			  admin_product_list/60/20
	@RequestMapping("/admin_product_add/{cid}/{sp}")
	public String admin_product_add(@PathVariable String cid,@PathVariable String sp, Product product) {
		System.err.println("新增加的商品"+product);
		System.err.println("sp"+sp);
		productService.add(product);
		return "redirect:/admin_product_list/"+cid+"/"+Integer.parseInt(sp);
	}
	
	//				  admin_product_edit/1/958
	@RequestMapping("/admin_product_edit/{cid}/{sp}/{pid}")
	public String admin_product_edit(@PathVariable String cid,@PathVariable String sp,@PathVariable String pid,Map<String,Object>map) {
		Product product = productService.queryById(Product.class, Integer.parseInt(pid));
		Category category = categoryService.queryById(Category.class, Integer.parseInt(cid));
		map.put("p", product);
		map.put("c", category);
		map.put("sp", Integer.parseInt(sp));
		return "admin/editProduct";
	}
	//				  admin_product_update
	@RequestMapping("/admin_product_update")
	public String admin_product_update(String sp,Product product) {
		productService.update(product);
		return "redirect:/admin_product_list/"+product.getCid()+"/"+Integer.parseInt(sp);
	}
}
