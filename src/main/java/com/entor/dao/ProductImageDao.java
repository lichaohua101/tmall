package com.entor.dao;

import java.util.List;

import com.entor.entity.ProductImage;

public interface ProductImageDao extends BaseDao<ProductImage>{
	
	/**
	 * 获取 产品管理的图片
	 * @param cid		类别Id
	 * @param piId		产品Id
	 * @return
	 */
	public int getScondImage(int cid,int pid);
	/**
	 * 批量删除记录
	 * @param ids	由主机编号拼接成的字符串，用逗号隔开，格式是：1,2,3,4,5
	 */
	public void deleteMore(String ids);
	/**
	 * 批量新增产品图片
	 * @param list
	 */
	public void addMore(List<ProductImage> list);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<ProductImage> queryAll();
	/**
	 * 根据产品编号查询图片
	 * @param currentPage	当前页码
	 * @param pageSize		每页记录数
	 * @param cid			产品类别编号
	 * @return
	 */
	public List<ProductImage> queryProductImagesByPid(int pid);
	/**
	 * 获取指定商品所有图片数量
	 * @param cid	商品类别编号
	 * @return
	 */
	public int getTotalsByPid(int pid);
}
