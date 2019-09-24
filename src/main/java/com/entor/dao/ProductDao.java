package com.entor.dao;

import java.util.List;

import com.entor.entity.Product;

public interface ProductDao extends BaseDao<Product>{

	/**
	 * 批量删除记录
	 * @param ids	由主机编号拼接成的字符串，用逗号隔开，格式是：1,2,3,4,5
	 */
	public void deleteMore(String ids);
	/**
	 * 批量新增商品类型
	 * @param list
	 */
	public void addMore(List<Product> list);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<Product> queryAll();
	/**
	 * 根据产品类别编号查询产品
	 * @param currentPage	当前页码
	 * @param pageSize		每页记录数
	 * @param cid			产品类别编号
	 * @return
	 */
	public List<Product> queryProductsByCid(int currentPage, int pageSize,int cid);
	/**
	 * 获取指定类别下所有商品总记录数
	 * @param cid	商品类别编号
	 * @return
	 */
	public int getTotalsByCid(int cid);
	/**
	 * 根据产品图片编号获取产品对象
	 * @param piid
	 * @return
	 */
	public Product queryByProductImageId(int piid);
	/**
	 * 根据商品类别编号查询所有商品
	 * @return
	 */
	public List<Product> queryAllByCid(int cid);
}
