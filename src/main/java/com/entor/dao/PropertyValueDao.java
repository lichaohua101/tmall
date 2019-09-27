package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.PropertyValue;
import com.entor.entity.PropertyValueVO;

public interface PropertyValueDao extends BaseDao<PropertyValue>{
	
	/**
	 * 修改商品属性
	 * @param map
	 */
	public void updateValueById(Map<String,String> map);
	/**
	 * 查找商品属性
	 * @param pid
	 * @return
	 */
	public List<PropertyValueVO> queryAllByPid(int pid);
	/**
	 * 批量添加商品属性值
	 * @param s
	 */
	public void addMore(List<PropertyValue> list);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<PropertyValue> queryAll();
	/**
	 * 根据产品编号查询所有属性
	 * @param pid			产品编号
	 * @return
	 */
	public List<PropertyValue> queryPropertyValuesByPid(int pid);
	/**
	 * 获取指定商品所有属性
	 * @param pid	商品编号
	 * @return
	 */
	public int getTotalsByPid(int pid);
	/**
	 * 根据主键更新值
	 * @param id
	 * @param value
	 */
	public void updateValueById(int id,String value);
	/**
	 * 根据商品编号查询所有属性名称或属性值
	 * @param pid
	 * @return
	 */
}
