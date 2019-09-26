package com.entor.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.entor.dao.ProductImageDao;
import com.entor.entity.ProductImage;

@Repository("productImageDao")
public class ProductImageDaoImpl extends BaseDaoImpl<ProductImage> implements ProductImageDao{

	private final String namespace = "ProductImage";
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	
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

	@Override
	public int getScondImage(int cid,int pid) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("cid", cid);
		map.put("pid", pid);
		return getSqlSession().selectOne(ProductImage.class.getSimpleName()+".getScondImage",map);
	}

}
