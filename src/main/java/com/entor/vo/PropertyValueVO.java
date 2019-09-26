package com.entor.vo;

public class PropertyValueVO {
	private int id;
	private String pname;
	private String value;
	public PropertyValueVO() {
		super();
	}
	public PropertyValueVO(int id, String pname, String value) {
		super();
		this.id = id;
		this.pname = pname;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "PropertyValueVO [id=" + id + ", pname=" + pname + ", value=" + value + "]";
	}
	
}
