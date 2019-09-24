package com.entor.entity;

public class OrderItem {
	/**
	 * 订单项主键编号
	 */
	private int id;
	/**
	 * 商品编号
	 */
	private int pid;
	/**
	 * 订单编号
	 */
	private int oid;
	/**
	 * 用户编号
	 */
	private int uid;
	/**
	 * 商品数量
	 */
	private int number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", pid=" + pid + ", oid=" + oid + ", uid=" + uid + ", number=" + number + "]";
	}
	
}
