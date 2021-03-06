package com.entor.entity;

import java.util.Date;
import java.util.List;

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
	private float  orignalPrice;
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
	/**
	 * 图片
	 */					 
	private ProductImage firstProductImage;
	/**
	 * 五张小图片
	 */
	private List<ProductImage> productSingleImages;
	/**
	 * 商品的属性
	 */
	private List<PropertyValueVO> property;
	/**
	 * 总评论
	 */
	private int reviewCount;
	/**
	 * 总销量
	 */
	private int saleCount;
	public Product() {
		super();
	}
	public Product(int id, String name, String subTitle, float orignalPrice, float promotePrice, int stock, int cid,
			Date createDate, ProductImage firstProductImage, List<ProductImage> productSingleImages,
			List<PropertyValueVO> property, int reviewCount, int saleCount) {
		super();
		this.id = id;
		this.name = name;
		this.subTitle = subTitle;
		this.orignalPrice = orignalPrice;
		this.promotePrice = promotePrice;
		this.stock = stock;
		this.cid = cid;
		this.createDate = createDate;
		this.firstProductImage = firstProductImage;
		this.productSingleImages = productSingleImages;
		this.property = property;
		this.reviewCount = reviewCount;
		this.saleCount = saleCount;
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
	public float getOrignalPrice() {
		return orignalPrice;
	}
	public void setOrignalPrice(float orignalPrice) {
		this.orignalPrice = orignalPrice;
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
	public ProductImage getFirstProductImage() {
		return firstProductImage;
	}
	public void setFirstProductImage(ProductImage firstProductImage) {
		this.firstProductImage = firstProductImage;
	}
	public List<ProductImage> getProductSingleImages() {
		return productSingleImages;
	}
	public void setProductSingleImages(List<ProductImage> productSingleImages) {
		this.productSingleImages = productSingleImages;
	}
	public List<PropertyValueVO> getProperty() {
		return property;
	}
	public void setProperty(List<PropertyValueVO> property) {
		this.property = property;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subTitle=" + subTitle + ", orignalPrice=" + orignalPrice
				+ ", promotePrice=" + promotePrice + ", stock=" + stock + ", cid=" + cid + ", createDate=" + createDate
				+ ", firstProductImage=" + firstProductImage + ", productSingleImages=" + productSingleImages
				+ ", property=" + property + ", reviewCount=" + reviewCount + ", saleCount=" + saleCount + "]";
	}
	
	
	
}
