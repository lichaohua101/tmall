package com.entor.entity;

import java.util.Date;

public class Order {
	/**
	 * 订单主键编号
	 */
	private int id;
	/**
	 * 订单号
	 */
	private String orderCode;
	/**
	 * 收货人地址
	 */
	private String address;
	/**
	 * 收货人邮编
	 */
	private String post;
	/**
	 * 收货人名字
	 */
	private String receiver;
	/**
	 * 收货人电话
	 */
	private String mobile;
	/**
	 * 买家留言
	 */
	private String userMessage;
	/**
	 * 下单时间
	 */
	private Date createDate;
	/**
	 * 支付时间
	 */
	private Date payDate;
	/**
	 * 发货时间
	 */
	private Date deliveryDate;
	/**
	 * 确认收货时间
	 */
	private Date confirmDate;
	/**
	 * 用户编号
	 */
	private int uid;
	/**
	 * 订单状态
	 */
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderCode=" + orderCode + ", address=" + address + ", post=" + post
				+ ", receiver=" + receiver + ", mobile=" + mobile + ", userMessage=" + userMessage + ", createDate="
				+ createDate + ", payDate=" + payDate + ", deliveryDate=" + deliveryDate + ", confirmDate="
				+ confirmDate + ", uid=" + uid + ", status=" + status + "]";
	}
	
}
