package com.entor.service;

import com.entor.entity.User;

public interface UserService extends BaseService<User>{
	
	public void test();
	/**
	 * 校验是否有此用户
	 * @return
	 */
	public User checkUser(User user);
}
