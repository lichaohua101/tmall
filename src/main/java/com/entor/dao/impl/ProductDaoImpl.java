package com.entor.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.ProductDao;
import com.entor.entity.Product;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {

	private final String namespace = "Product";
	
	@Override
	public void add(Product t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product queryById(Class<?> cls, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMore(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMore(List<Product> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> queryProductsByCid(int currentPage, int pageSize, int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalsByCid(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product queryByProductImageId(int piid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> queryAllByCid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
