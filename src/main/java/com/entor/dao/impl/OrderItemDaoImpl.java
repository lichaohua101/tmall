package com.entor.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.entor.dao.OrderItemDao;
import com.entor.entity.OrderItem;

@Repository("orderItemDao")
public class OrderItemDaoImpl extends BaseDaoImpl<OrderItem> implements OrderItemDao{

	private final String namespace = "OrderItem";

	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}



	@Override
	public String getSaleByPid(int pid){
		return getSqlSession().selectOne(namespace+".getSaleByPid",pid);
	}



	@Override
	public List<OrderItem> queryAllByUid(int uid) {
		return getSqlSession().selectList(namespace+".queryAllByUid",uid);
	}
	
}
