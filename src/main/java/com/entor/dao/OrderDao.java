package com.entor.dao;

import java.util.List;

import com.entor.entity.Order;

public interface OrderDao extends BaseDao<Order>{

	/**
	 * 批量删除订单
	 * @param ids	由主机编号拼接成的字符串，用逗号隔开，格式是：1,2,3,4,5
	 */
	public void deleteMore(String ids);
	/**
	 * 批量新增订单
	 * @param list
	 */
	public void addMore(List<Order> list);
	/**
	 * 查询所有订单
	 * @return
	 */
	public List<Order> queryAll();
	/**
	 * 后台订单显示列表
	 * @param currentPage
	 * @param pageSize
	 * @param condition
	 * @return
	 */
}
