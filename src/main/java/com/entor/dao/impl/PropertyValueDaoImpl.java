package com.entor.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.entor.dao.PropertyValueDao;
import com.entor.entity.PropertyValue;
import com.entor.entity.PropertyValueVO;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Repository("PropertyValueDao")
public class PropertyValueDaoImpl extends BaseDaoImpl<PropertyValue> implements PropertyValueDao{

	private final String namespace = "propertyValue";	
	
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

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

	@Override
	public List<PropertyValueVO> queryAllByPid(int pid) {
		return getSqlSession().selectList(namespace+".queryAllByPid",pid);
	}

	@Override
	public void updateValueById(Map<String, String> map) {
		 getSqlSession().update(namespace+".updateValueById",map);
	}


}
