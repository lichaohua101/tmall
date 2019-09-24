package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderItemDao;
import com.entor.entity.OrderItem;
import com.entor.service.OrederItemService;

@Service("orederItemService")
public class OrderItemServiceimpl extends BaseServiceImpl<OrderItem> implements OrederItemService{

	
	@Resource
	private OrderItemDao orderItemDao;
}
