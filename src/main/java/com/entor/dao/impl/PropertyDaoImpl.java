package com.entor.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.entor.dao.PropertyDao;
import com.entor.entity.Property;


@Repository("propertyDao")
public class PropertyDaoImpl extends BaseDaoImpl<Property> implements PropertyDao{

	private final String namespace = "Property";
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
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

	@Override
	public List<Property> queryByCidPage(Map<String, Integer> map) {
		return getSqlSession().selectList(Property.class.getSimpleName()+".queryByCidPage", map);
	}

	@Override
	public int getByCidTotals(int cid) {
		return getSqlSession().selectOne(Property.class.getSimpleName()+".getByCidTotals", cid);
	}

}
