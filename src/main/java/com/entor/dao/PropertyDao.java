package com.entor.dao;

import java.util.List;

import com.entor.entity.Property;

public interface PropertyDao extends BaseDao<Property>{

	/**
	 * 批量删除记录
	 * @param ids	由主机编号拼接成的字符串，用逗号隔开，格式是：1,2,3,4,5
	 */
	public void deleteMore(String ids);
	/**
	 * 批量新增商品类型
	 * @param list
	 */
	public void addMore(List<Property> list);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<Property> queryAll();
	/**
	 * 根据商品类别编号查询所有属性
	 * @return
	 */
	public List<Property> queryAllByCid(int cid);
	/**
	 * 根据产品类别编号查询属性
	 * @param currentPage	当前页码
	 * @param pageSize		每页记录数
	 * @param cid			产品类别编号
	 * @return
	 */
	public List<Property> queryPropertysByCid(int currentPage, int pageSize,int cid);
	/**
	 * 获取指定类别下所有属性总记录数
	 * @param cid	商品类别编号
	 * @return
	 */
	public int getTotalsByCid(int cid);
}
