package com.entor.entity;

public class User {
	/**
	 * 用户编号
	 */
	private int id;
	/**
	 * 登录账号
	 */
	private String name;
	/**
	 * 登录密码
	 */
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	

}
