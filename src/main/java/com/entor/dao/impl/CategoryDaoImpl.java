package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.CategoryDao;
import com.entor.entity.Category;

@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao{

	private final String namespace = "Category";
	
	@Override
	public int deleteMore(String ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addMore(List<Category> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category queryByPid(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category queryByPropertyid(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

}
