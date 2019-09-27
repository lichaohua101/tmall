package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.UserDao;
import com.entor.entity.User;
import com.entor.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Resource
	private UserDao userDao;

	@Override
	public void test() {
	System.out.println("测试成功");
	}

	@Override
	public User checkUser(User user) {
		return userDao.checkUser(user);
	}
	
	
}
