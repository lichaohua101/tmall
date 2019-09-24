package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.OrderDao;
import com.entor.entity.Order;

@Repository("orderDao")
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao{

	private final String namespace = "Order";
	
	@Override
	public void deleteMore(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMore(List<Order> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
