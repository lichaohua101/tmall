package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderDao;
import com.entor.entity.Order;
import com.entor.service.OrderService;

@Service("orderService")
public class OrederServiceImpl extends BaseServiceImpl<Order> implements OrderService {

	@Resource
	private OrderDao orderDao;
}
