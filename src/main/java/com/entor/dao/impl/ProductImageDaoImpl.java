package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.ProductImageDao;
import com.entor.entity.ProductImage;

@Repository("productImageDao")
public class ProductImageDaoImpl extends BaseDaoImpl<ProductImage> implements ProductImageDao{

	private final String namespace = "ProductImage";
	
	@Override
	public void deleteMore(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMore(List<ProductImage> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductImage> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductImage> queryProductImagesByPid(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalsByPid(int pid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
