package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.PropertyDao;
import com.entor.entity.Property;


@Repository("propertyDao")
public class PropertyDaoImpl extends BaseDaoImpl<Property> implements PropertyDao{

	private final String namespace = "Property";
	
	@Override
	public void deleteMore(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMore(List<Property> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Property> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> queryAllByCid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> queryPropertysByCid(int currentPage, int pageSize, int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalsByCid(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
