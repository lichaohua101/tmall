package com.entor.service.empl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderItemDao;
import com.entor.entity.OrderItem;
import com.entor.service.OrederItemService;

@Service("orederItemService")
public class OrderItemServiceimpl extends BaseServiceImpl<OrderItem> implements OrederItemService{

	
	@Resource
	private OrderItemDao orderItemDao;

	@Override
	public String getSaleByPid(int pid) {
		return orderItemDao.getSaleByPid(pid);
	}

	@Override
	public List<OrderItem> queryAllByUid(int uid) {
		return orderItemDao.queryAllByUid(uid);
	}
}
