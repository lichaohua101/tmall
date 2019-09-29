package com.entor.service;

import java.util.List;

import com.entor.entity.OrderItem;

public interface OrederItemService extends BaseService<OrderItem>{
	public String getSaleByPid(int pid);
	public List<OrderItem> queryAllByUid(int uid);
}
