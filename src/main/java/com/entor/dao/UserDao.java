package com.entor.dao;

import java.util.List;

import com.entor.entity.User;

public interface UserDao extends BaseDao<User>{

	/**
	 * 用户登录
	 * @param username	登录账号
	 * @param password	登录密码
	 * @return			登录成功的用户对象
	 */
	public User login(String username,String password);
	/**
	 * 批量删除记录
	 * @param ids	由主机编号拼接成的字符串，用逗号隔开，格式是：1,2,3,4,5
	 */
	public void deleteMore(String ids);
	/**
	 * 批量新增用户
	 * @param list
	 */
	public void addMore(List<User> list);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<User> queryAll();
	/**
	 * 检查用户名是否存在
	 * @return
	 */
	public boolean checkUsername(String username);
}
