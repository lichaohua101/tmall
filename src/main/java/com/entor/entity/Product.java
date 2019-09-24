package com.entor.entity;

import java.util.Date;

public class Product {
	/**
	 * 产品编号
	 */
	private int id;
	/**
	 * 产品名称
	 */
	private String name;
	/**
	 * 产品子标题
	 */
	private String subTitle;
	/**
	 * 原价格
	 */
	private float originalPrice;
	/**
	 * 优惠价格
	 */
	private float promotePrice;
	/**
	 * 库存
	 */
	private int stock;
	/**
	 * 所属类别
	 */
	private int cid;
	/**
	 * 产品上架时间
	 */
	private Date createDate;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subTitle=" + subTitle + ", originalPrice=" + originalPrice
				+ ", promotePrice=" + promotePrice + ", stock=" + stock + ", cid=" + cid + ", createDate=" + createDate
				+ "]";
	}
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
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public float getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(float promotePrice) {
		this.promotePrice = promotePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
