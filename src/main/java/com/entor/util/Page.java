package com.entor.util;

import java.util.List;

public class Page<T> {
	/**
	 * 当前页码数
	 */
	private int sp;
	/**
	 * 每页显示的记录数
	 */
	private int pageSize =10;
	/**
	 * 总记录数
	 */
	private int totals;
	/**
	 * 总页数
	 */
	private int pageCount;
	/**
	 * 分页的内容
	 */
	private List<T> list;
	/**
	 * 起始页码
	 */
	private int start;
	public Page() {
		super();
	}
	/**
	 * 默认每页显示10行记录数
	 * @param currentPage
	 * @param total
	 */
	public Page(String currentPage,int total) {
		this(currentPage,10,total);
	}
	public Page(String currentPage,int pageSize, int total) {
		this.pageSize = pageSize;
		this.totals=total;
		try {
			this.sp=Integer.parseInt(currentPage);
		} catch (Exception e) {
			this.sp=1;
		}
		this.pageCount=this.totals/this.pageSize;
		if (this.totals%this.pageSize!=0) {
			this.pageCount++;
		}
		if (this.sp>this.pageCount) {
			this.sp=this.pageCount;
		}
		if (this.sp<1) {
			this.sp=1;
		}
		this.start =( sp-1)*pageSize;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotals() {
		return totals;
	}
	public void setTotals(int totals) {
		this.totals = totals;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
