package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.CategoryDao;
import com.entor.entity.Category;
import com.entor.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService{
	
	
	@Resource
	private CategoryDao categoryDao;

}
