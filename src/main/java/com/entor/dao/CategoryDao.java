package com.entor.dao;

import java.util.List;

import com.entor.entity.Category;

public interface CategoryDao extends BaseDao<Category>{

	/**
	 * 批量删除记录
	 * @param ids	由主机编号拼接成的字符串，用逗号隔开，格式是：1,2,3,4,5
	 */
	public int deleteMore(String ids);
	/**
	 * 批量新增商品类型
	 * @param list
	 */
	public void addMore(List<Category> list);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<Category> queryAll();
	/**
	 * 根据商品编号查询类别
	 * @param pid
	 * @return
	 */
	public Category queryByPid(int pid);
	/**
	 * 根据属性编号查询类别
	 * @param pid
	 * @return
	 */
	public Category queryByPropertyid(int pid);
}
