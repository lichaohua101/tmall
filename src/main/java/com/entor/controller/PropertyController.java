package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Category;
import com.entor.entity.Property;
import com.entor.service.CategoryService;
import com.entor.service.PropertyService;
import com.entor.util.Page;

@Controller
public class PropertyController {
	@Resource
	private PropertyService propertyService;
	@Resource
	private CategoryService categoryService;
	
	@RequestMapping("/admin_property_list/{cid}/{currentPage}")
	public String admin_property_list(@PathVariable String cid,@PathVariable String currentPage,Map<String,Object> map) {
		Category category =  categoryService.queryById(Category.class, cid);
		int totals = propertyService.getByCidTotals(Integer.parseInt(cid));
		Page<Property> page = new Page<>(currentPage, 5,totals );
		List<Property> list = propertyService.queryByCidPage(Integer.parseInt(cid),page.getSp(),page.getPageSize());
		map.put("ps",list);
		map.put("page", page);
		map.put("list", "admin_property_list");
		map.put("c", category);
		map.put("Cateid", cid);
		return "admin/listProperty";
	}
	//添加属性 admin_property_add"
	@RequestMapping("/admin_property_add")
	public String admin_property_add(String name,int cid) {
		Category category = categoryService.queryById(Category.class, cid);
		Property property = new Property();
		property.setCid(category.getId());
		property.setName(name);
		propertyService.add(property);
		int Id = property.getId();
		return "admin_property_list/"+cid+"/1";
	}
	
	//修改admin_property_edit/60/243/1
	@RequestMapping("/admin_property_edit/{cid}/{pid}/{sp}")
	public String admin_property_edit(@PathVariable String cid, @PathVariable String pid,@PathVariable String sp, Map<String, Object> map) {
		//admin_property_edit/${p.id} queryByPidGetPropertyAndCategory
		Category category =  categoryService.queryById(Category.class,Integer.parseInt(cid));
		Property property =  propertyService.queryById(Property.class, Integer.parseInt(pid));
		map.put("p", property);
		map.put("c", category);
		map.put("cid", cid);
		map.put("sp", sp);
		return "admin/editProperty";
	}
	@RequestMapping("/admin_property_update")
	public String update(Property property,String cid,String sp) {
		propertyService.update(property);
		System.out.println(cid);
		return "redirect:/admin_property_list/"+cid+"/"+sp;
	}
	//admin_property_delete/60/267/4
	@RequestMapping("/admin_property_delete/{cid}/{id}/{sp}")
	public String admin_property_delete(@PathVariable String cid ,@PathVariable String id,@PathVariable String sp) {
		propertyService.deleteById(Property.class, Integer.parseInt(id));
		return "redirect:/admin_property_list/"+cid+"/"+sp;
	}
}
