package com.entor.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.entor.dao.ProductDao;
import com.entor.entity.Product;
import com.entor.entity.Property;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {

	private final String namespace = "product";
	

	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
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
		return getSqlSession().selectOne(Product.class.getSimpleName()+".getTotalsByCid", cid);
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

	@Override
	public List<Product> queryByCidPage(Map<String, Integer> map){
		return getSqlSession().selectList(Product.class.getSimpleName()+".queryByCidPage",map);
	}

	@Override
	public int getByCidTotals(int cid) {
		return getSqlSession().selectOne(Product.class.getSimpleName()+".getByCidTotals",cid);
	}

}
