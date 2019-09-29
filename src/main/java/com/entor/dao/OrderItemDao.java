package com.entor.dao;


import java.util.List;

import com.entor.entity.OrderItem;

public interface OrderItemDao extends BaseDao<OrderItem>{
	/**
	 * 一种商品成交了多少单
	 * @return
	 */
	public String getSaleByPid(int pid);
	/**
	 * 查询同一个用户的所有订单
	 * @param uid
	 * @return
	 */
	public List<OrderItem> queryAllByUid(int uid);
}
