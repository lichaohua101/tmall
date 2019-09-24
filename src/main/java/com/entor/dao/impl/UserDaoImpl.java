package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.UserDao;
import com.entor.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	private final String namespace = "User";	
	
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMore(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMore(List<User> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
