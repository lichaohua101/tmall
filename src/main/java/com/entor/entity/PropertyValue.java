package com.entor.entity;

public class PropertyValue {
	/**
	 * 主键编号
	 */
	private int id;
	/**
	 * 商品编号
	 */
	private int pid;
	/**
	 * 属性编号
	 */
	private int ptid;
	/**
	 * 属性值
	 */
	private String value;

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

	public int getPtid() {
		return ptid;
	}

	public void setPtid(int ptid) {
		this.ptid = ptid;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
