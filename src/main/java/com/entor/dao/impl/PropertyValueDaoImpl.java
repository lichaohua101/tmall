package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.PropertyValueDao;
import com.entor.entity.PropertyValue;

@Repository("PropertyValueDao")
public class PropertyValueDaoImpl extends BaseDaoImpl<PropertyValue> implements PropertyValueDao{

	private final String namespace = "PropertyValue";	
	
	@Override
	public void addMore(List<PropertyValue> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PropertyValue> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyValue> queryPropertyValuesByPid(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalsByPid(int pid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateValueById(int id, String value) {
		// TODO Auto-generated method stub
		
	}

}
