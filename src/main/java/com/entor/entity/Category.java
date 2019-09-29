package com.entor.entity;

import java.util.List;

public class Category {
	/**
	 * 类别编号
	 */
	private int id;
	/**
	 * 类别名称
	 */
	private String name;
	/**
	 * 产品集合
	 */
	private List<Product> products;
	public Category() {
		super();
	}
	public Category(int id, String name, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
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
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
	
}
